package fiit.oop.Storage;

import java.io.Serializable;

abstract class Item implements ItemInterface, Serializable {

    protected Item(String itemName, int initialQuantity){
        setItemName(itemName);
        setQuantity(initialQuantity);
    }

    @Override
    public void Status() { /* for print quantity */
        System.out.println("You have " + quantity + " " + itemName + " on storage");
    }

}
