package fiit.oop.Core;

import fiit.oop.People.*;

import java.util.ArrayList;

public class App {

    public ArrayList<Worker> workers;
    public Worker actualUser;

    public App(){
        workers = staffInitialization();
    }

    public ArrayList<Worker> staffInitialization(){

        ArrayList<Worker> workers = new ArrayList<>();

        workers.add( new Manager("Romanko", "TheManager", 420, "0000") );
        workers.add( new Designer("Kristobal", "Balenciaga", 421, "0000") );
        workers.add( new Tailor("Anna", "Green", 430, "0000"));

        return workers;
    }

    public boolean checkUser(String userIdString, String pass){

        try{
            int userID = Integer.parseInt(userIdString);

            for(Worker i : workers){

                if(i.getId() == userID){

                    if(i.getPass().equals(pass)){
                        System.out.println("Prihlásili ste sa ako: " + i.name + " " + i.surname);
                        this.actualUser = i;
                        return true;
                    }
                }
            }
            return false;

        }catch (NumberFormatException e){
            System.out.println("Zadali ID v nesprávnom formáte");
            return false;
        }
    }

}
