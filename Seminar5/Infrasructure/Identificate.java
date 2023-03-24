package Seminar5.Infrasructure;

public class Identificate {
    private static int id;
    static {
        id = 0;
    }
    public Identificate(){
        id++;
    }
    public int getId() {
        return this.id;
    }
    public boolean equals(Identificate idd) {
        return this.id == idd.getId();
    }
}
