package Seminar5.Infrasructure.Attestation;

public class Subjects {
    private String nameOfSubject;
    private int mark;
    private int minMark;
    {
        minMark = 3;
    }
    public Subjects(String nameOfSubject){
        this.nameOfSubject = nameOfSubject;
    }
    public void addMark(int mark){
        this.mark = mark;
    }
    public String getNameOfSubject() {
        return nameOfSubject;
    }
    public int getMark() {
        return mark;
    }
    public void setMinMark(int minMark) {
        this.minMark = minMark;
    }
    public int getMinMark() {
        return this.minMark;
    }

    @Override
    public String toString() {
        return String.format("%s - %d",nameOfSubject,mark);
    }

    public boolean equals(Subjects obj) {
        return this.nameOfSubject == obj.nameOfSubject;
    }
}
