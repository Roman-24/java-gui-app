package fiit.oop.Core;

import fiit.oop.Storage.Cloth;

public class Order {

    private int customerID;
    private int size;
    private String typeOfSuit;
    private String clothMaterial;
    private boolean design;
    private String designDescription;
    private int condition; // stav objednávky

    public Order(int customerID, int size, String typeOfSuit, String clothMaterial){

        this.customerID = customerID;
        this.size = size;
        this.typeOfSuit = typeOfSuit;
        this.clothMaterial = clothMaterial;
        this.design = false;
        this.condition = 0;
    }

    public String getDesignDescription() {
        return designDescription;
    }

    public void setDesignDescription(String designDescription) {
        this.designDescription = designDescription;
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

    public boolean isDesign() {
        return design;
    }

    public void setDesign(boolean design) {
        this.design = design;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }
}
