package Seminar5.Infrasructure.People;

import Seminar5.Infrasructure.Exception.ExceptionAttestations;
import Seminar5.Infrasructure.Attestation.Subjects;

public class Teacher extends Human {
    private String specialization;
    private int salary;
    public Teacher(String name, String surname, String phone, String specialization) {
        super(name, surname, phone);
        this.specialization = specialization;
    }
    public void rateASubject(Student st, int mark) throws ExceptionAttestations {
        for(Subjects sub : st.getSchedule().getSubjects()) {
            if(sub.getNameOfSubject() == specialization){
                sub.addMark(mark);
                return;
            }
        }
        throw new ExceptionAttestations("Вы не можете поставить оценку, так как у вас другая специализация");
    }

    public boolean equals(Teacher teacher) {
        return this.specialization == teacher.specialization;
    }

    @Override
    public String toString() {
        return String.format("%s %s - %s",this.name,this.surname,this.specialization);
    }
}
