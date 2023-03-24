package Seminar5.Infrasructure.People;

import Seminar5.GetElement;
import Seminar5.Infrasructure.Exception.ExceptionGettingHuman;
import Seminar5.Infrasructure.Identificate;

import java.util.ArrayList;
import java.util.Iterator;

public class StudyGroup<T extends Human> implements Iterable<T>, GetElement {
    private ArrayList<T> group;
    private String numGroup;
    public StudyGroup(ArrayList<T> group) {
        this.group = group;
    }
    public String getNumGroup() {
        return this.numGroup;
    }
    public StudyGroup(ArrayList<T> group, String numGroup) {
        this.group = group;
        this.numGroup = numGroup;
        setNameGroup();
    }
    public void setNameGroup() {
        for (Student o : (ArrayList<Student>) group) {
            o.setNumGroup(numGroup);
        }
    }
    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < group.size();
            }

            @Override
            public T next() {
                return group.get(index++);
            }
        };
        return it;
    }
    @Override
    public String toString() {
        return group.toString();
    }
}
