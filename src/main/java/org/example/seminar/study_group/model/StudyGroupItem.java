package org.example.seminar.study_group.model;

public interface StudyGroupItem<T> extends Comparable<T> {
    int getAge();
    //String getName(); - лишнее
}
