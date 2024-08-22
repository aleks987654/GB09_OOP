package org.example.seminar.study_group.presenter;

import org.example.seminar.study_group.model.StudentService;
import org.example.seminar.study_group.view.View;

public class Presenter {
    private View view;
    private StudentService service;

    public Presenter(View view) {
        this.view = view;
        service = new StudentService();
    }

    public void addStudent(String name, int age) {
        service.addStudent(name, age);
        getStudentListInfo();
    }

    public void sortByName() {
        service.sortByName();
        getStudentListInfo();
    }

    public void sortByAge() {
        service.sortByAge();
        getStudentListInfo();
    }

    public void getStudentListInfo() {
        String answer = service.getStudentListInfo();
        view.printAnswer(answer);
    }
}
