package fiit.oop.Storage;

import java.io.Serializable;

public class Storage implements Serializable {

    private Cloth cloth;
    private Buttons buttons;

    public Storage(){
        cloth = new Cloth(999999);
        buttons = new Buttons(9999);
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }

    public Buttons getButtons() {
        return buttons;
    }

    public void setButtons(Buttons buttons) {
        this.buttons = buttons;
    }



    public class Buttons extends Item implements Serializable {

        public Buttons(int initialQuantity) {
            super("buttons", initialQuantity);
            this.setQuantity(9999);
        }
    }

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
}