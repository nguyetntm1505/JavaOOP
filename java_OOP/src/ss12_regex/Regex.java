package ss12_regex;

import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //a. Kiểm tra số điện thoại
        //Bắt đầu bằng số 0 hoặc (+84).
        //2 số tiếp theo có thể là: 32, 33, 34, 35, 36, 37, 38, 39.
        //7 số tiếp theo là số.
        System.out.print("Hay nhap so dien thoai can kiem tra: ");
        String phoneNumber = scanner.nextLine();
        boolean isValidPhoneNumber = phoneNumber.matches("(0|([(][+]84[)]))3[2-9][0-9]{7,8}");

        if (isValidPhoneNumber) {
            System.out.println("Số điện thoại hợp lệ.");
        } else {
            System.out.println("Số điện thoại không hợp lệ.");
        }

        //b. Kiểm tra email
        //Chứa các ký tự từ A đến Z, a đến z.
        //Các ký tự số.
        //Ký tự gạch dưới.
        //Ký tự @.
        //Các ký tự trước @ có từ 6 đến 32 ký tự.
        //Chuỗi ký tự sau @ chia thành hai phần của domain mỗi phần có từ 2 đến 12 ký tự.
        System.out.print("Hay nhap email can kiem tra: ");
        String emailAddress = scanner.nextLine();
        boolean isValidEmail = emailAddress.matches("[A-Za-z0-9_]{6,32}@[A-Za-z]{2,12}[.][A-Za-z]{2,12}");

        if (isValidEmail) {
            System.out.println("Email hợp lệ.");
        } else {
            System.out.println("Email không hợp lệ.");
        }

        //c. Kiểm tra Username
        //Chứa các ký tự từ A đến Z, a đến z, 0-9, dấu chấm (.) và dấu gạch dưới (_).
        //Độ dài từ 6 đến 32 ký tự.
        System.out.print("Hay nhap username can kiem tra: ");
        String userName = scanner.nextLine();
        boolean isValidUserName = userName.matches("[A-Za-z0-9._]{6,32}");

        if (isValidUserName) {
            System.out.println("Username hợp lệ.");
        } else {
            System.out.println("Username không hợp lệ.");
        }

        //d. Kiểm tra Password
        //Chứa cả ký tự hoa, thường, số, ký tự đặc biệt và dấu chấm (.).
        //Bắt đầu bằng ký tự in hoa.
        //Có từ 6 đến 32 ký tự.
        System.out.print("Hay nhap password can kiem tra: ");
        String password = scanner.nextLine();
        boolean isValidPassword = password.matches("[A-Z]([a-z]*[0-9]*[.]*[!@#$%^&*()_+=]*[*/]){5,31}");

        if (isValidPassword) {
            System.out.println("Password hợp lệ.");
        } else {
            System.out.println("Password không hợp lệ.");
        }
    }
}
