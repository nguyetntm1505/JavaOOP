package ss3_static.student;

import java.util.Scanner;

public class StudentManagement {
    static Scanner scanner = new Scanner(System.in);
    static Student student = new Student();

    public static void main(String[] args) {
        int studentCount = 0;
        String choose;
        do {
            System.out.println("---Nhap thong tin sinh vien---");
            student.input();
            studentCount++;
            System.out.print("Nhap YES de tiep tuc, NO de dung lai: ");
            choose = scanner.nextLine();
        } while (choose.equals("YES") || choose.equals("Yes") || choose.equals("yes"));

        System.out.print("So luong sinh vien: " + studentCount);

    }
}
