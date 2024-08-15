package ss10_exception;

import ss10_exception.validation.PhoneValidation;

import java.util.Scanner;

public class OldPhone extends Phone {
    private double pin;
    private String moreDescription;

    public OldPhone() {
    }

    public OldPhone(String id, String name, int price, int maintanceTime, String productor, double pin, String moreDescription) {
        super(id, name, price, maintanceTime, productor);
        this.pin = pin;
        this.moreDescription = moreDescription;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice();
    }

    public void discountOlePhone(double discountPercent) {
        setPrice((getPrice() * ((100 - discountPercent) / 100)));
    }

    public void input() {
        super.input();
        this.pin = PhoneValidation.inputPin("PIN");
        this.moreDescription = PhoneValidation.inputMoreDescription("thong tin mo ta them");
    }

    public void output() {
        super.output();
        System.out.println("Pin: " + this.pin);
        System.out.println("Mo ta them: " + this.moreDescription);
    }
}
