package fiit.oop.Storage;

abstract class Item {

    protected String itemName;
    protected int quantity;

    public void Status() { /* for print quantity */
        System.out.println("You have " + quantity + " " + this.itemName + " on storage");
    }

    // get and set quantity methods
    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
