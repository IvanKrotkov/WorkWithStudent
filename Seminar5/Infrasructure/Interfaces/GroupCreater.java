package Seminar5.Infrasructure.Interfaces;


import Seminar5.Infrasructure.People.Student;
import Seminar5.Infrasructure.People.Teacher;

import java.io.IOException;
import java.util.ArrayList;

public interface GroupCreater extends WorkerWithFile, ThatAdds, WorkWithSubj {
    default ArrayList<Teacher> teamCreate(String nameFile) throws IOException {
        ArrayList<Teacher> teachers = new ArrayList<>();
        String[] dataTeacher = readFile(nameFile);
        addTeachers(dataTeacher,teachers);
        return teachers;
    }
    default ArrayList<Student> groupStudentCreate(String nameFile) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        String[] dataStudents = readFile(nameFile);
        addStudents(dataStudents,students);
        return students;
    }
}
