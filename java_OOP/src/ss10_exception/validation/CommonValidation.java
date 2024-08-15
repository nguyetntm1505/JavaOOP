package ss10_exception.validation;

import ss10_exception.exception.EmptyFieldException;
import ss10_exception.exception.MinLengthException;
import ss10_exception.exception.NegativeNumberException;
import ss10_exception.exception.NumberOutOfRangeException;

public class CommonValidation {
    public static void validateIsEmpty(String value, String fieldName) throws EmptyFieldException {
        if (value.isEmpty()) {
            throw new EmptyFieldException(fieldName + " la truong bat buoc nhap !!");
        }
    }

    public static Double parseDouble(String value, String fieldName) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(fieldName + " phai la so thuc!! ");
        }
    }

    public static int parseInt(String value, String fieldName) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(fieldName + " phai la so nguyen!! ");
        }
    }

    public static void validNumberOutOfRangeException(double value, String fieldName, double minValue, double maxValue) throws NumberOutOfRangeException {
        if (value < minValue || value > maxValue) {
            throw new NumberOutOfRangeException(fieldName + " nam ngoai gia tri hop le " + minValue + "-" + maxValue + "%");
        }
    }

    public static void charMinLengthException(String value, String fieldName, int minLength) throws MinLengthException {
        if (value.length() < minLength) {
            throw new MinLengthException(fieldName + " phai co it nhat " + minLength + " ky tu !!");
        }
    }

    public static void validNegativeNumberException(double value, String field) throws NegativeNumberException {
        if (value < 0) {
            throw new NegativeNumberException(field + " phai la so nguyen duong !!");
        }
    }

}
