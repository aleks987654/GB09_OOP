package org.example.seminar.study_group;

import org.example.seminar.study_group.model.StudentService;
import org.example.seminar.study_group.view.ConsoleUI;
import org.example.seminar.study_group.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.start();
    }
}
