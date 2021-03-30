package fiit.oop.Storage;

import java.io.Serializable;

public class Buttons extends Item implements Serializable {

    public Buttons(int initialQuantity) {
        super("buttons", initialQuantity);
        this.setQuantity(9999);
    }
}
