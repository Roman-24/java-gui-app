package fiit.oop.Core;

import fiit.oop.People.Worker;

import java.util.List;

public interface ModelInterface {

    void addOrder(int customerID, int size, String typeOfSuit, String clothMaterial);
    default Order findOrder(int orderID){
        System.out.println("Hľadám objednávku");
        return null;
    };
    List<Worker> staffInitialization();
    boolean checkUser(String userIdString, String pass);
    void logUser();
}
