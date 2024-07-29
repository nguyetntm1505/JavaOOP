package ss3_static.mathutil;

public class MathUtilManagement {
    public static void main(String[] args) {
        double num1 = 20.0;
        double num2 = 4.0;

        double a = MathUtil.add(num1, num2);
        double b = MathUtil.subtract(num1, num2);
        double c = MathUtil.multiply(num1, num2);
        double d = MathUtil.divide(num1, num2);

        System.out.println("Tong: " + a);
        System.out.println("Hieu: " + b);
        System.out.println("Tich: " + c);
        System.out.println("Thuong: " + d);
    }
}
