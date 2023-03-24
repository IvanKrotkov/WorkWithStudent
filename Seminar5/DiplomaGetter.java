package Seminar5;

import Seminar5.Infrasructure.Attestation.Schedule;
import Seminar5.Infrasructure.Exception.ExceptionIssuingDiploma;
import Seminar5.Infrasructure.People.Student;
import Seminar5.Infrasructure.People.StudyGroup;

public interface DiplomaGetter {
   default void getDiploma(StudyGroup<Student> students) throws ExceptionIssuingDiploma {
        for (Student s: students) {
            Schedule ss = s.issueADiploma();
            System.out.println(String.format("Поздравляем студента группы %s с дипломированием!\n",s.getNumGroup()));
            System.out.println(String.format("Диплом %s\n%s",s.toString(),ss.toString("\t")));
        }
    }
}
