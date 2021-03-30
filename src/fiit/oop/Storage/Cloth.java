package fiit.oop.Storage;

import java.io.Serializable;

public class Cloth extends Item implements Serializable {

    // String type;

    public Cloth(int initialQuantity) {
        super("cloth", initialQuantity);
        this.setQuantity(999999);
    }

    public Cloth(String itemName, int initialQuantity) {
        super(itemName, initialQuantity);
    }

}
