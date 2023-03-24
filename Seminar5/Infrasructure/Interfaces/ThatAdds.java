package Seminar5.Infrasructure.Interfaces;

import Seminar5.Infrasructure.Attestation.Schedule;
import Seminar5.Infrasructure.People.Student;
import Seminar5.Infrasructure.People.Teacher;

import java.util.ArrayList;

public interface ThatAdds extends WorkWithSubj {
    default void addTeachers(String[] data, ArrayList<Teacher> teachers){
        for (int i = 0; i < data.length; i++) {
            String[] temp = data[i].split(" ");
            StringBuilder specialization = new StringBuilder();
            for (int j = 3; j < temp.length; j++) {
                specialization.append(temp[j]);
                if (j != temp.length - 1) specialization.append(" ");
            }
            teachers.add(new Teacher(temp[0], temp[1], temp[2], specialization.toString()));
        }
    }
    default void addStudents(String[] data, ArrayList<Student> students){
        for (int i = 0; i < data.length; i++) {
            String[] temp = data[i].split(" ");
            Student student = new Student(temp[0], temp[1], temp[2]);
            student.setSchedule(new Schedule<>(setSubjAndMak(temp,3)));
            students.add(student);
        }
    }
}
