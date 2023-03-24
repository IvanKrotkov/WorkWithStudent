package Seminar5.Infrasructure.People;

import Seminar5.Infrasructure.Identificate;

public abstract class Human {
    protected Identificate id;
    protected String name;
    protected String surname;
    protected String phone;
    protected Human(String name,String surname,String phone){
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.id = new Identificate();
    }
}
