package ss3_static.student;

import java.util.Scanner;

public class Student {
    private String mssv;
    private String name;
    private double score;

    public Student() {

    }

    public Student(String mssv) {
        this.mssv = mssv;
    }

    public Student(String mssv, String name) {
        this.mssv = mssv;
        this.name = name;
    }

    public Student(String mssv, String name, double score) {
        this.mssv = mssv;
        this.name = name;
        this.score = score;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap ma so sinh vien: ");
        mssv = scanner.nextLine();
        System.out.print("Hay nhap ten sinh vien: ");
        name = scanner.nextLine();
        System.out.print("Hay nhap diem so cua sinh vien: ");
        score = scanner.nextDouble();
    }
}
