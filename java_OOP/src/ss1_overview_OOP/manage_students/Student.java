package ss1_overview_OOP.manage_students;

import java.util.Scanner;

public class Student {
    String name;
    double mathScore;
    double literatureScore;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap ten hoc sinh: ");
        name = scanner.nextLine();
        System.out.print("Hay nhap diem toan: ");
        mathScore = Double.parseDouble(scanner.nextLine());
        System.out.print("Hay nhap diem van: ");
        literatureScore = Double.parseDouble(scanner.nextLine());
    }

    void output() {
        System.out.println("Ten cua hoc sinh: " + name);
        System.out.println("Diem toan: " + mathScore);
        System.out.println("Diem van: " + literatureScore);
        System.out.println("Diem trung binh: " + calculateAverageScore());
    }

    double calculateAverageScore() {
        double average = (mathScore + literatureScore) / 2;
        return average;
    }
}
