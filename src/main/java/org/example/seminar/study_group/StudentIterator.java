package org.example.seminar.study_group;

import java.util.Iterator;
import java.util.List;

class StudentIterator implements Iterator<Student> {
    private int curIndex;
    private List<Student> students;

    public StudentIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return students.size() > curIndex;
    }

    @Override
    public Student next() {
        return students.get(curIndex++);
    }
}
