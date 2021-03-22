package fiit.oop.People;

class Worker extends Person {

    protected int id;
    protected String position;
    protected String email;

    Worker(String name, String surname, int id) {
        super(name, surname);
        this.id = id;
    }

    void work(){
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}