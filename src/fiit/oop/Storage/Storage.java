package fiit.oop.Storage;

import java.awt.*;

public class Storage {

    private Cloth cloth;
    private Buttons buttons;


    Storage(){
        Cloth cloth = new Cloth(999999);
        Buttons buttons = new Buttons(9999);
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
}