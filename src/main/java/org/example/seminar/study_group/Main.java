package org.example.seminar.study_group;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        service.addStudent("Sasha", 18);
        service.addStudent("Masha", 19);
        service.addStudent("Dasha", 18);
        service.addStudent("Pasha", 17);

        System.out.println(service.getStudentListInfo());
    }
}
