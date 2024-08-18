package org.example.seminar.study_group;

import java.util.Iterator;

public class StudentService {
    private StudyGroup studyGroup;
    private StudentBuilder builder;

    public StudentService() {
        studyGroup = new StudyGroup();
        builder = new StudentBuilder();
    }

    public void addStudent(String studentName, int studentAge){
        Student student = builder
                .setStudentName(studentName)
                .setStudentAge(studentAge)
                .build();
        studyGroup.addStudent(student);
    }

    public void sortByName(){
        studyGroup.sortByName();
    }

    public void sortByAge(){
        studyGroup.sortByAge();
    }

    public String getStudentListInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("List of students:\n");

        /**
         * Памятка "Развёртка foreach"
        Iterator<Student> iterator = studyGroup.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
        */
        for (Student student: studyGroup){
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
