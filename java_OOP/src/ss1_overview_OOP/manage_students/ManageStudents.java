package ss1_overview_OOP.manage_students;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudents {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        ArrayList<Student> students = new ArrayList<>();
//        System.out.print("Hay nhap so luong sinh vien: ");
//        int number = scanner.nextInt();
//
//        for(int i = 0; i<number; i++){
//            System.out.printf("Nhap thong tin hoc sinh thu %d:\n", i+1);
//            Student student = new Student();
//            student.input();
//            students.add(student);
//
//        }
//        System.out.println("\n---Thong tin hoc sinh---");
//        for(int i = 0; i<number; i++) {
//            students.get(i).output();
//            System.out.println();
//        }

        System.out.print("Hay nhap so luong sinh vien: ");
        int number = scanner.nextInt();
        Student[] students = new Student[number];

        for (int i = 0; i < number; i++) {
            System.out.printf("Nhap thong tin hoc sinh thu %d:\n", i + 1);
            students[i] = new Student();
            students[i].input();
        }
        System.out.println("\n---Thong tin hoc sinh---");
        for (int i = 0; i < number; i++) {
            students[i].output();
            System.out.println();
        }
    }
}
