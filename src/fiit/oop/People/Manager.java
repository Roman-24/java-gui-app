package fiit.oop.People;

import fiit.oop.Core.Order;

import java.util.ArrayList;

public class Manager extends Worker {

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
}
