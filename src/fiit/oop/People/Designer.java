package fiit.oop.People;

public class Designer extends Worker{

    public Designer(String name, String surname, int id, String pass) {
        super(name, surname, id, pass);
        this.setPosition("Designer");
    }

}
