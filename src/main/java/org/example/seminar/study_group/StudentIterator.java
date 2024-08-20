package org.example.seminar.study_group;

import java.util.Iterator;
import java.util.List;

class StudentIterator<T> implements Iterator<T> {
    private int curIndex;
    private List<T> students;

    public StudentIterator(List<T> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return students.size() > curIndex;
    }

    @Override
    public T next() {
        return students.get(curIndex++);
    }
}
