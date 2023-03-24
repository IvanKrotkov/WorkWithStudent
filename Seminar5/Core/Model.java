package Seminar5.Core;

import Seminar5.Infrasructure.Exception.ExceptionAttestations;
import Seminar5.Infrasructure.Exception.ExceptionGettingHuman;
import Seminar5.Infrasructure.Identificate;
import Seminar5.Infrasructure.People.Student;
import Seminar5.Infrasructure.People.StudyGroup;
import Seminar5.Infrasructure.People.Teacher;

public class Model {
    private StudyGroup<Student> students;
    private StudyGroup<Teacher> teachers;
    public Model(StudyGroup<Student> students,StudyGroup<Teacher> teachers){
        this.students = students;
        this.teachers = teachers;
    }
    public void rateSubject(String nameOfSubj, Identificate idStudent, int mark) throws ExceptionAttestations, ExceptionGettingHuman {
        Teacher t = (Teacher) teachers.getElement(nameOfSubj,this.teachers);
        Student s = (Student) students.getElement(idStudent,this.students);
        t.rateASubject(s,mark);
    }
    public StudyGroup<Student> getStudents() {
        return this.students;
    }
    public StudyGroup<Teacher> getTeachers() {
        return this.teachers;
    }

    public void setStudents(StudyGroup<Student> students) {
        this.students = students;
    }

    public void setTeachers(StudyGroup<Teacher> teachers) {
        this.teachers = teachers;
    }
}
