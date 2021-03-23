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

public class App {

    public ArrayList<Worker> workers;
    public Worker actualUser;
    public Storage storage;

    public App(){
        this.workers = staffInitialization();
    }

    public ArrayList<Worker> staffInitialization() {

        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(new Manager("Romanko", "TheManager", 420, "0000"));
        workers.add(new Designer("Kristobal", "Balenciaga", 421, "0000"));
        workers.add(new Tailor("Anna", "Green", 430, "0000", storage));

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