package fiit.oop.People;

import fiit.oop.Core.Order;

import java.util.ArrayList;

public class Designer extends Worker {

    public Designer(String name, String surname, int id, String pass, ArrayList<Order> orders) {
        super(name, surname, id, pass, orders);
        this.setPosition("Designer");
    }

    public void setDesign(Order order, String design) {
        order.setDesign(true);
        order.setDesignDescription(design);
    }
}
