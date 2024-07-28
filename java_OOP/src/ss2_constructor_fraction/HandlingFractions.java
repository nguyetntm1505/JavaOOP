package ss2_constructor_fraction;

public class HandlingFractions {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        a.output();
        Fraction b = new Fraction(1, 2);
        b.output();
        Fraction c = new Fraction(3);
        c.output();
        Fraction d = new Fraction(-6, -2);
        d.output();
        Fraction e = new Fraction(3, -1);
        e.output();
    }
}
