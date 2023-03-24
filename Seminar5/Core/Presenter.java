package Seminar5.Core;

import Seminar5.Infrasructure.Interfaces.DiplomaGetter;
import Seminar5.Infrasructure.Interfaces.GroupCreater;
import Seminar5.Infrasructure.Exception.ExceptionIssuingDiploma;
import Seminar5.Infrasructure.Interfaces.WorkerWithFile;
import Seminar5.Infrasructure.People.Student;
import Seminar5.Infrasructure.People.StudyGroup;
import Seminar5.Infrasructure.People.Teacher;

import java.io.*;
public class Presenter implements View, WorkerWithFile, GroupCreater, DiplomaGetter {
    Model model;
    @Override
    public void viewData() throws ExceptionIssuingDiploma {
        System.out.println("Студенты");
        for (Student s : this.model.getStudents()) {
            System.out.printf(String.format("\t%s\n", s.toString()));
            System.out.printf(String.format("%s\n", s.getSchedule().toString("\t\t")));
        }
        System.out.println("Преподаватели");
        for (Teacher t : this.model.getTeachers()) {
            System.out.printf(String.format("\t%s\n", t.toString()));
        }
        getDiploma(this.model.getStudents());
    }
    @Override
    public void setData() throws IOException {
        StudyGroup<Student> students = new StudyGroup<>(groupStudentCreate("Students.txt"), "GP-19");
        StudyGroup<Teacher> teachers = new StudyGroup<>(teamCreate("Teachers.txt"));
        this.model = new Model(students,teachers);
    }

    /**
     * Проверка исключения
     * @throws IOException
     */
    public void setDataForTest() throws IOException {
        StudyGroup<Student> students = new StudyGroup<>(groupStudentCreate("StudentsForTest.txt"), "GP-19");
        StudyGroup<Teacher> teachers = new StudyGroup<>(teamCreate("Teachers.txt"));
        this.model = new Model(students,teachers);
    }
}
