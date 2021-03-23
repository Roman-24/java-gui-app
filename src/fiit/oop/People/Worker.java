package fiit.oop.People;

public class Worker extends Person {

    private int id;

    private String position;
    private String pass;
    private String email;

    public Worker(String name, String surname, int id, String pass) {
        super(name, surname);
        this.id = id;
        this.pass = pass;
    }

    public void work(){
        System.out.println("I like working");
    }


    // getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}