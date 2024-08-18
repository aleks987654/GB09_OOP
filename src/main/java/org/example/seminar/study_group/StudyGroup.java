package org.example.seminar.study_group;

import java.util.*;

public class StudyGroup implements Iterable<Student>{
    private List<Student> students;

    public StudyGroup() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void sortByName(){
        Collections.sort(students);
    }

    public void sortByAge(){
        Collections.sort(students, new StudentComparatorByAge());

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        });

//            Collections.sort(students, (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));

//        Collections.sort(students, Comparator.comparing(Student::getName));
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(students);
    }
}
