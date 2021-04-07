package fiit.oop.Core;

import fiit.oop.Controllers.DesignerController;
import fiit.oop.Controllers.ManagerController;
import fiit.oop.Controllers.TailorController;
import fiit.oop.GUI.DesignerScene;
import fiit.oop.GUI.ManagerScene;
import fiit.oop.GUI.TailorScene;
import fiit.oop.People.*;
import fiit.oop.Storage.Storage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ModelApp implements ModelInterface, Serializable {

    public List<Worker> workers;
    public ArrayList<Order> orders;
    public Worker actualUser;
    public Storage storage = new Storage();

    public ModelApp(){

        this.workers = staffInitialization();
        this.orders = new ArrayList<>();
    }

    public void addOrder(int customerID, int size, String typeOfSuit, String clothMaterial){
        Order newOrder = new Order(customerID, size, typeOfSuit, clothMaterial);
        this.orders.add(newOrder);
    }

    public void findOrderAndSetDesign(int orderID, String design){

        for (Order order : orders)
            if(orderID == order.getCustomerID()){
                order.setDesignDescription(design);
                order.setDesign(true);
            }
    }

    @Override
    public Order findOrder(int orderID){

        for (Order order : orders)
            if(orderID == order.getCustomerID()){
                System.out.println("hľadaná objednávka " + order.getCustomerID());
                return order;
            }
        return null;
    }

    public List<Worker> staffInitialization() {

        List<Worker> workers = new ArrayList<Worker>(); // Generickosť

        workers.add(new Manager("Romanko", "TheManager", 420, "0000", orders));
        workers.add(new Designer("Kristobal", "Balenciaga", 421, "0000", orders));
        workers.add(new Tailor("Anna", "Green", 430, "0000", orders, storage));

        return workers;
    }

    public boolean checkUser(String userIdString, String pass) {

        try {
            int userID = Integer.parseInt(userIdString);

            for (Worker i : workers) {

                if (i.getId() == userID) {

                    if (i.getPass().equals(pass)) {
                        System.out.println("Prihlásili ste sa ako: " + i.name + " " + i.surname);
                        this.actualUser = i;
                        return true;
                    }
                }
            }
            return false;

        } catch (NumberFormat_MyException e) {
            System.out.println(e);
            return false;
        }
    }

    public void logUser(){ // RTTI

        if(this.actualUser instanceof Manager){
            ManagerScene managerScene = new ManagerScene();
            ManagerController managerController = new ManagerController(managerScene, this);
        }
        else if(this.actualUser instanceof Designer){
            DesignerScene designerScene = new DesignerScene();
            DesignerController designerController = new DesignerController(designerScene, this);

        }
        else if(this.actualUser instanceof Tailor){
            TailorScene tailorScene = new TailorScene();
            TailorController tailorController = new TailorController(tailorScene, this);
        }
    }

    public Tailor getTailor(){
        for(Worker i : workers)
            if(i instanceof Tailor)
                return (Tailor)i;
        return null;
    }

}