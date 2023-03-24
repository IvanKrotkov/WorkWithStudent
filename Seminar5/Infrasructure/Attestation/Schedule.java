package Seminar5.Infrasructure.Attestation;

import java.util.ArrayList;
import java.util.Iterator;

public class Schedule<T extends Subjects> implements Iterable<Subjects> {
    private ArrayList<Subjects> subjects;
    {
        subjects = new ArrayList<>();
        subjects.add(new Subjects("Math"));
        subjects.add(new Subjects("Socialogy"));
        subjects.add(new Subjects("A culture of speech"));
    }
    public Schedule(ArrayList<Subjects> subjects) {
        this.subjects = subjects;
    }
    public void addSubject(Subjects obj) {
        this.subjects.add(obj);
    }
    public ArrayList<Subjects> getSubjects() {
        return this.subjects;
    }
    public void removeSubject(String nameOfSub) {
        for (Subjects o : this.subjects) {
            if (o.getNameOfSubject() == nameOfSub) {
                this.subjects.remove(o);
            }
        }
    }
    public void addMarkASubject(String nameOfSub, int mark) {
        for (Subjects o : this.subjects) {
            if (o.getNameOfSubject() == nameOfSub) {
                o.addMark(mark);
            }
        }
    }
    public String toString(String indent) {
        StringBuilder sb = new StringBuilder();
        for (Subjects s : this.subjects) {
            sb.append(indent);
            sb.append(s.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Subjects s : this.subjects) {
            sb.append(s.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
    @Override
    public Iterator<Subjects> iterator() {
        Iterator<Subjects> it = new Iterator<Subjects>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < subjects.size();
            }

            @Override
            public Subjects next() {
                return subjects.get(index++);
            }
        };
        return it;
    }
}
