package Seminar5.Infrasructure.People;

import Seminar5.Infrasructure.Exception.ExceptionIssuingDiploma;
import Seminar5.Infrasructure.Identificate;
import Seminar5.Infrasructure.Attestation.Schedule;
import Seminar5.Infrasructure.Attestation.Subjects;

public class Student extends Human {
    private String numGroup;
    public void setNumGroup(String numGroup) {
        this.numGroup = numGroup;
    }
    private Schedule<Subjects> schedule;
    public Student(String name, String surname,
                   String phone){
        super(name,surname,phone);
    }
    public void gradeASubject(String nameOfSub, int mark){
        schedule.addMarkASubject(nameOfSub,mark);
    }
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    public Identificate getId() {
        return this.id;
    }
    public Schedule<Subjects> getSchedule() {
        return this.schedule;
    }
    public Schedule issueADiploma() throws ExceptionIssuingDiploma {
        for (Subjects o : this.schedule) {
            if(o.getMark() < o.getMinMark()){
                throw new ExceptionIssuingDiploma(
                        String.format("Ошибка атестации, пересдайте предмет: %s",o.getNameOfSubject()));
            }
        }
        return this.schedule;
    }
    public String getNumGroup() {
        return numGroup;
    }
    @Override
    public String toString() {
        return String.format("%s %s - %s",this.name,this.surname, this.numGroup);
    }
}
