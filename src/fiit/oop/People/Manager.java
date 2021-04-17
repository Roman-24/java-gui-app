package fiit.oop.People;

import fiit.oop.Core.ModelApp;
import fiit.oop.Core.Order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Manager extends Worker implements Serializable {

    ModelApp modelApp;

    public Manager(String name, String surname, int id, String pass, ModelApp modelApp, ArrayList<Order> orders) {
        super(name, surname, id, pass, orders);
        this.setPosition("Manager");

        this. modelApp = modelApp;
    }

    public void consultationWithTheCustomer(){

    }

    public void checkTheQuality(){

    }

    @Override
    public int work() { // Manager má kao prácu nejaké organizačné veci
        super.work();
        System.out.println("Manager pracuje 24/7");
        return checkTheOrders(); // napríklad vie zistiť koľko práve existuje objednávok
    }

    public int checkTheOrders(){

        AtomicInteger count = new AtomicInteger();
        modelApp.orders.forEach((order -> { // Lambda výraz

            if(order != null)
                count.getAndIncrement();
        }));

        if(count.intValue() == modelApp.orders.size()){
            System.out.println("Aktuálne máme " + count + " objednávok");
            return count.intValue();
        } else
            return 0;

    }

    public void deletOrder(int orderID){

        modelApp.orders.forEach((order -> { // Lambda výraz

            if(orderID == order.getCustomerID()){
                modelApp.orders.remove(order);
                System.out.println("Objednávka s číslom " + orderID + "bola vymazaná");
            }


        }));
    }
}
