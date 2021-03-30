package fiit.oop.Storage;

public class Storage {

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
}