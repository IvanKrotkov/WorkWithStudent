package Seminar5;

import Seminar5.Infrasructure.Attestation.Subjects;

import java.util.ArrayList;

public interface WorkWithSubjAndMark{
    default ArrayList<Subjects> setSubjAndMak(String[] strings, int index) {
        String[] s = findSubjAndMak(strings, index);
        ArrayList<Subjects> subjects = new ArrayList<>();
        addSubjects(s,subjects);
        return subjects;
    }
    default String[] findSubjAndMak(String[] strings,int index){
        StringBuilder sb = new StringBuilder();
        for (int i = index; i < strings.length; i++) {
            sb.append(strings[i]);
            if(i!=strings.length-1) sb.append(" ");
        }
        String[] s = sb.toString().split("-");
        return s;
    }
    default void addSubjects(String[] s, ArrayList<Subjects> subjects ){
        for (String str : s) {
            String[] temp = str.split(":");
            Subjects subject = new Subjects(temp[0]);
            if (!temp[1].equals("*")) {
                subject.addMark(Integer.parseInt(temp[1]));
            }
            subjects.add(subject);
        }
    }
}
