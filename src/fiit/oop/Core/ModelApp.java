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

    public ModelApp() {

        this.workers = staffInitialization();
        this.orders = new ArrayList<>();
    }

    // met=oda na pridanie novej objednávky do zoznamu objednávok
    public void addOrder(int customerID, int size, String typeOfSuit, String clothMaterial) {
        Order newOrder = new Order(customerID, size, typeOfSuit, clothMaterial);
        this.orders.add(newOrder);
    }

    // vyhľadá objednávku kt. má byť nastavený dizajn a setne daný dizajn
    public void findOrderAndSetDesign(int orderID, String design) {

        // pôvodný loop bez lambda výrazu
        /*for (Order order : orders)
            if(orderID == order.getCustomerID()){
                order.setDesignDescription(design);
                order.setDesign(true);
            }*/

        orders.forEach((order -> { // Lambda výraz
            if (orderID == order.getCustomerID()) {
                order.setDesignDescription(design);
                order.setDesign(true);
            }
        }));
    }

    // vyhľadá objednávku pre dané ID
    @Override
    public Order findOrder(int orderID) {

        for (Order order : orders)
            if (orderID == order.getCustomerID()) {
                System.out.println("hľadaná objednávka " + order.getCustomerID());
                return order;
            }
        return null;
    }

    // vytvorenia pracovníkov v systéme
    public List<Worker> staffInitialization() {

        List<Worker> workers = new ArrayList<Worker>(); // Generickosť

        workers.add(new Manager("Romanko", "TheManager", 420, "0000", this, orders));
        workers.add(new Designer("Kristobal", "Balenciaga", 421, "0000", orders));
        workers.add(new Tailor("Anna", "Green", 430, "0000", orders, storage));

        return workers;
    }

    //overí kto sa práve prihlasuje a či sú zadané údaje správne
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

    // funkcia prihlási daného používateľa a určí aká príslušná scéna sa má vykresliť
    public void logUser() { // RTTI

        if (this.actualUser instanceof Manager) {
            ManagerScene managerScene = new ManagerScene();
            new ManagerController(managerScene, this);
        } else if (this.actualUser instanceof Designer) {
            DesignerScene designerScene = new DesignerScene();
            new DesignerController(designerScene, this);

        } else if (this.actualUser instanceof Tailor) {
            TailorScene tailorScene = new TailorScene();
            new TailorController(tailorScene, this);
        }
    }

    // vracia tailora
    public Tailor getTailor() {
        for (Worker i : workers)
            if (i instanceof Tailor)
                return (Tailor) i;
        return null;
    }

    // vracia managera
    public Manager getManager() {
        for (Worker i : workers)
            if (i instanceof Manager)
                return (Manager) i;
        return null;
    }

}