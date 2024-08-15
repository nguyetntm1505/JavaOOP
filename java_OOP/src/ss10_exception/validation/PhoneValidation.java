package ss10_exception.validation;

import java.util.Scanner;

public class PhoneValidation {
    private static final Scanner scanner = new Scanner(System.in);

    public static String inputName(String fieldName) {
        while (true) {
            try {
                System.out.printf("Hay nhap %s: ", fieldName);
                String value = scanner.nextLine();

                CommonValidation.validateIsEmpty(value, fieldName);

                return value;

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Xin vui long nhap lai.");

            }
        }
    }

    public static Double inputPrice(String fieldName) {
        while (true) {
            try {
                System.out.printf("Hay nhap %s: ", fieldName);
                String value = scanner.nextLine();

                CommonValidation.validateIsEmpty(value, fieldName);

                double price = CommonValidation.parseDouble(value, fieldName);

                CommonValidation.validNegativeNumberException(price, fieldName);

                return price;

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Xin vui long nhap lai.");

            }
        }
    }

    public static int inputMaintanceTime(String fieldName) {
        while (true) {
            try {
                System.out.printf("Hay nhap %s: ", fieldName);
                String value = scanner.nextLine();

                CommonValidation.validateIsEmpty(value, fieldName);

                int MaintanceTime = CommonValidation.parseInt(value, fieldName);

                CommonValidation.validNegativeNumberException(MaintanceTime, fieldName);

                return MaintanceTime;

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Xin vui long nhap lai.");

            }
        }
    }

    public static String inputProductor(String fieldName) {
        while (true) {
            try {
                System.out.printf("Hay nhap %s: ", fieldName);
                String value = scanner.nextLine();

                CommonValidation.validateIsEmpty(value, fieldName);

                return value;

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Xin vui long nhap lai.");

            }
        }
    }

    //oldphone
    public static Double inputPin(String fieldName) {
        while (true) {
            try {
                System.out.printf("Hay nhap %s: ", fieldName);
                String value = scanner.nextLine();

                CommonValidation.validateIsEmpty(value, fieldName);

                double pin = CommonValidation.parseDouble(value, fieldName);

                CommonValidation.validNumberOutOfRangeException(pin, fieldName, 0, 100);

                return pin;

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Xin vui long nhap lai.");

            }
        }
    }

    public static String inputMoreDescription(String fieldName) {
        while (true) {
            try {
                System.out.printf("Hay nhap %s: ", fieldName);
                String value = scanner.nextLine();

                CommonValidation.validateIsEmpty(value, fieldName);

                CommonValidation.charMinLengthException(value, fieldName, 10);

                return value;

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Xin vui long nhap lai.");

            }
        }
    }

    public static Double inputDiscountPercentOldPhone(String fieldName) {
        while (true) {
            try {
                System.out.printf("Hay nhap %s: ", fieldName);
                String value = scanner.nextLine();

                CommonValidation.validateIsEmpty(value, fieldName);

                double discountPercent = CommonValidation.parseDouble(value, fieldName);

                CommonValidation.validNumberOutOfRangeException(discountPercent, fieldName, 1, 100);

                return discountPercent;

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Xin vui long nhap lai.");

            }
        }
    }

    //newphone
    public static int inputNumber(String fieldName) {
        while (true) {
            try {
                System.out.printf("Hay nhap %s: ", fieldName);
                String value = scanner.nextLine();

                CommonValidation.validateIsEmpty(value, fieldName);

                int number = CommonValidation.parseInt(value, fieldName);

                CommonValidation.validNegativeNumberException(number, fieldName);

                return number;

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Xin vui long nhap lai.");

            }
        }
    }

}
