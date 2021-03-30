package fiit.oop.People;

import java.io.Serializable;

abstract class Person implements Serializable {

    public String name;
    public String surname;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

}
