package ss1_overview_OOP.handling_fraction;

import java.util.Scanner;

public class Fraction {
    int tuSo;
    int mauSo;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap tu so: ");
        tuSo = scanner.nextInt();
        do {
            System.out.print("Hay nhap mau so: ");
            mauSo = scanner.nextInt();
            if (mauSo == 0) {
                System.out.println("Hay nhap mau so khac 0!!");
            }
        } while (mauSo == 0);
    }

    void output() {
        if (tuSo == 0) {
            System.out.println(tuSo);
        } else {
            tuSo = this.tuSo / uocChungLonNhat();
            mauSo = this.mauSo / uocChungLonNhat();
            if (mauSo < 0) {
                tuSo = -tuSo;
                mauSo = -mauSo;
            }
            if (mauSo == 1) {
                System.out.printf("%d", tuSo);
            } else {
                System.out.printf("%d/%d", tuSo, mauSo);
            }
            System.out.println();
        }
    }

    int uocChungLonNhat() {
        int tuSoTemp = Math.abs(tuSo);
        for (int i = tuSoTemp; i >= 1; i--) {
            if (tuSo % i == 0 && mauSo % i == 0) {
                return i;
            }
        }
        return 1;
    }

    Fraction plus(Fraction phanSoKhac) {
        Fraction ketQua = new Fraction();
        ketQua.tuSo = this.tuSo * phanSoKhac.mauSo + phanSoKhac.tuSo * this.mauSo;
        ketQua.mauSo = this.mauSo * phanSoKhac.mauSo;
        return ketQua;
    }

    Fraction minus(Fraction phanSoKhac) {
        Fraction ketQua = new Fraction();
        ketQua.tuSo = this.tuSo * phanSoKhac.mauSo - phanSoKhac.tuSo * this.mauSo;
        ketQua.mauSo = this.mauSo * phanSoKhac.mauSo;
        return ketQua;
    }

    Fraction tich(Fraction phanSoKhac) {
        Fraction ketQua = new Fraction();
        ketQua.tuSo = this.tuSo * phanSoKhac.tuSo;
        ketQua.mauSo = this.mauSo * phanSoKhac.mauSo;
        return ketQua;
    }

    Fraction thuong(Fraction phanSoKhac) {
        Fraction ketQua = new Fraction();
        ketQua.tuSo = this.tuSo * phanSoKhac.mauSo;
        ketQua.mauSo = this.mauSo * phanSoKhac.tuSo;
        return ketQua;
    }

    void kiemTraPhanSo() {
        if (tuSo > 0) {
            System.out.println("Phan so nay la phan so duong");
        } else if (tuSo == 0) {
            System.out.println("Phan so nay la phan so bang 0");
        } else {
            System.out.println("Phan so nay la phan so am");
        }
    }

}
