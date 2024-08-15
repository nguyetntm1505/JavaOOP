package ss10_exception;

import ss10_exception.validation.PhoneValidation;

import java.util.Scanner;

public class NewPhone extends Phone {
    private int number;

    public NewPhone() {
    }

    public NewPhone(String id, String name, int price, int maintanceTime, String productor, int number) {
        super(id, name, price, maintanceTime, productor);
        this.number = number;
    }

    public double calculateTotalPrice() {
        return getPrice() * number;
    }

    public void input() {
        super.input();
        System.out.print("Hay nhap so luong dien thoai co trong kho: ");
        this.number = PhoneValidation.inputNumber("so luong dien thoai co trong kho");
    }

    public void output() {
        super.output();
        System.out.println("So luong: " + this.number);
    }
}
