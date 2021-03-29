package fiit.oop.Storage;

public class Cloth extends Item {

    // String type;

    public Cloth(int initialQuantity) {
        super("cloth", initialQuantity);
        this.setQuantity(999999);
    }

    public Cloth(String itemName, int initialQuantity) {
        super(itemName, initialQuantity);
    }

}
