package org.example.seminar.study_group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student>{
    private List<Student> students;

    public StudyGroup() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(students);
    }
}
