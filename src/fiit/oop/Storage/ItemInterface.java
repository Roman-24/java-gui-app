package fiit.oop.Storage;

public interface ItemInterface {
    String itemName = null;
    int quantity = 0;
    void Status();

    // get and set quantity methods
    default String getItemName() {
        return itemName;
    }

    default void setItemName(String itemName) {
        itemName = itemName;
    }

    default int getQuantity() {
        return quantity;
    }

    default void setQuantity(int quantity) {
        quantity = quantity;
    }
}
