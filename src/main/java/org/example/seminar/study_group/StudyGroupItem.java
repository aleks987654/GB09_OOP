package org.example.seminar.study_group;

public interface StudyGroupItem<T> extends Comparable<T> {
    int getAge();
    //String getName(); - лишнее
}
