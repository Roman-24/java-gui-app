package fiit.oop.People;

public class Tailor extends Worker{

    public Tailor(String name, String surname, int id, String pass) {
        super(name, surname, id, pass);
        this.setPosition("Tailor");
    }

}
