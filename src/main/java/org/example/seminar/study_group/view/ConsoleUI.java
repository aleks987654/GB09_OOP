package org.example.seminar.study_group.view;

import org.example.seminar.study_group.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
    }

    @Override
    public void start() {
        System.out.println("Greetings!");
        while (work){
            System.out.println("1. Add student.");
            System.out.println("2. Sort by name.");
            System.out.println("3. Sort by age.");
            System.out.println("4. Get list of students.");
            System.out.println("5. Finish");

            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    addStudent();
                    break;
                case "2":
                    sortByName();
                    break;
                case "3":
                    sortByAge();
                    break;
                case "4":
                    getStudentListInfo();
                    break;
                case "5":
                    finish();
                    break;
                default:
                    error();

            }
        }
    }

    private void finish() {
        System.out.println("Thank you for using this program.");
        work = false;
    }

    private void getStudentListInfo() {
        presenter.getStudentListInfo();
    }

    private void sortByAge() {
        presenter.sortByAge();
    }

    private void sortByName() {
        presenter.sortByName();
    }

    private void addStudent() {
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student age: ");
        String strAge = scanner.nextLine();
        //TODO: Add validity testing methods
        int age = Integer.parseInt(strAge);

        presenter.addStudent(name, age);
    }

    private void error() {
        System.out.println("Invalid input. Try again.");
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
}
