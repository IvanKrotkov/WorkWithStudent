package Seminar5;

import Seminar5.Infrasructure.Exception.ExceptionGettingHuman;
import Seminar5.Infrasructure.People.Human;
import Seminar5.Infrasructure.People.StudyGroup;


public interface GetElement<T extends Human,E> {
    default T getElement(E human, StudyGroup<T> group) throws ExceptionGettingHuman {
        for (T s : group) {
            if (s.equals(human)) return s;
        }
        throw new ExceptionGettingHuman("Такого человека в данной группе нет");
    }
}
