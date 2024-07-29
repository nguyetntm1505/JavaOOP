package ss1_overview_OOP.handling_fraction;

import java.util.Scanner;

public class HandlingFractions {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Fraction a = new Fraction();
        Fraction b = new Fraction();
        System.out.println("Nhap phan so thu nhat: ");
        a.input();
        System.out.println("Nhap phan so thu hai: ");
        b.input();
        System.out.print("Phan so thu nhat sau khi rut gon: ");
        a.output();
        System.out.print("Phan so thu hai sau khi rut gon: ");
        b.output();

        System.out.print("Tong cua 2 phan so la: ");
        Fraction cong = a.plus(b);
        cong.output();

        System.out.print("Hieu cua 2 phan so la: ");
        Fraction hieu = a.minus(b);
        hieu.output();

        System.out.print("Tich cua 2 phan so la: ");
        Fraction tich = a.tich(b);
        tich.output();

        System.out.print("Thuong cua 2 phan so la: ");
        if (b.tuSo == 0) {
            System.out.println("Khong the thuc hien phep tinh nay!!");
        } else {
            Fraction thuong = a.thuong(b);
            thuong.output();
        }

        System.out.print("Ket qua kiem tra cua phan so thu nhat: ");
        a.kiemTraPhanSo();
        System.out.print("Ket qua kiem tra cua phan so thu hai: ");
        b.kiemTraPhanSo();
    }
}
