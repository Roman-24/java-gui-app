package fiit.oop.People;

import fiit.oop.Core.Order;

import java.io.Serializable;
import java.util.ArrayList;

public class Manager extends Worker implements Serializable {

    public Manager(String name, String surname, int id, String pass, ArrayList<Order> orders) {
        super(name, surname, id, pass, orders);
        this.setPosition("Manager");
    }

    public void checkTheOrder(){

    }

    public void consultationWithTheCustomer(){

    }

    public void checkTheQuality(){

    }

    @Override
    public void work() {
        super.work();
        System.out.println("Manager pracuje 24/7");

    }
}
