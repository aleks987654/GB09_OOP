package org.example.seminar.study_group;

public class StudentBuilder {
    private int genId;
    private Student student;
    private String studentName;
    private int studentAge;

    public StudentBuilder setStudentAge(int studentAge){
        this.studentAge = studentAge;
        return this;
    }

    public StudentBuilder setStudentName(String studentName){
        this.studentName = studentName;
        return this;
    }

    private void createStudent(){
        student = new Student();
    }

    private void nextId(){
        student.setId(genId++);
    }

    private void createName(){
        student.setName(studentName);
    }

    private void createAge(){
        student.setAge(studentAge);
    }

    public Student build(){
        createStudent();
        createName();
        createAge();
        nextId();
        return student;
    }
}
