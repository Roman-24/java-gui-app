package fiit.oop.Core;

import fiit.oop.Storage.Cloth;

public class Order {

    private int customerID;
    private int size;
    private String typeOfSuit;
    private String clothMaterial;
    private int condition; // stav objednávky

    public Order(int customerID, int size, String typeOfSuit, String clothMaterial){
        this.customerID = customerID;
        this.size = size;
        this.typeOfSuit = typeOfSuit;
        this.clothMaterial = clothMaterial;
        this.condition = 0;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTypeOfSuit() {
        return typeOfSuit;
    }

    public void setTypeOfSuit(String typeOfSuit) {
        this.typeOfSuit = typeOfSuit;
    }

    public String getClothMaterial() {
        return clothMaterial;
    }

    public void setClothMaterial(String clothMaterial) {
        this.clothMaterial = clothMaterial;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }
}
