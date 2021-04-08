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
    public void work() { // Manager má kao prácu nejaké organizačné veci
        super.work();
        System.out.println("Manager pracuje 24/7");
        checkTheOrders(); // napríklad vie zistiť koľko práve existuje objednávok
    }

    public void checkTheOrders(){

        AtomicInteger count = new AtomicInteger();
        modelApp.orders.forEach((order -> { // Lambda výraz

            if(order != null)
                count.getAndIncrement();
        }));

        if(count.intValue() == modelApp.orders.size())
            System.out.println("Aktuálne máme " + count + " objednávok");
    }
}
