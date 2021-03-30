package fiit.oop.Storage;

import java.io.Serializable;

abstract class Item implements Serializable {

    protected String itemName;
    protected int quantity;

    protected Item(String itemName, int initialQuantity){
        this.itemName = itemName;
        this.quantity = initialQuantity;
    }

    public void Status() { /* for print quantity */
        System.out.println("You have " + quantity + " " + this.itemName + " on storage");
    }

    // get and set quantity methods

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
