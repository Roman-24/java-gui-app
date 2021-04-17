package fiit.oop.People;

import fiit.oop.Core.Order;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Worker extends Person implements Serializable {

    private int id;
    private String position;
    private String pass;
    private String email;
    private ArrayList<Order> orders;

    public Worker(String name, String surname, int id, String pass, ArrayList<Order> orders) {
        super(name, surname);
        this.id = id;
        this.pass = pass;
        this.orders = orders;
    }

    public int work(){
        System.out.println("I like working");
        return 0;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
}