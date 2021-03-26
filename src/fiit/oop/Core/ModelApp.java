package fiit.oop.Core;

import fiit.oop.Controllers.DesignerController;
import fiit.oop.Controllers.ManagerController;
import fiit.oop.Controllers.TailorController;
import fiit.oop.GUI.DesignerScene;
import fiit.oop.GUI.ManagerScene;
import fiit.oop.GUI.TailorScene;
import fiit.oop.People.*;
import fiit.oop.Storage.Storage;

import java.util.ArrayList;

public class ModelApp {

    public ArrayList<Worker> workers;
    public ArrayList<Order> orders = new ArrayList<>();
    public Worker actualUser;
    public Storage storage;

    public ModelApp(){
        this.workers = staffInitialization();
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

    public ArrayList<Worker> staffInitialization() {

        ArrayList<Worker> workers = new ArrayList<>();

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

        } catch (NumberFormatException e) {
            System.out.println("Zadali ID v nesprávnom formáte");
            return false;
        }
    }

    public void logUser(){

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

}