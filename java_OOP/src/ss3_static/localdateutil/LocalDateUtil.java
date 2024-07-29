package ss3_static.localdateutil;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUtil {
    private static DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private static DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static LocalDate fromString_ddMMyyyy(String date) {
        return LocalDate.parse(date, formatter1);
    }

    public static LocalDate fromString_yyyyMMdd(String date) {
        return LocalDate.parse(date, formatter2);
    }

    public static String toString_ddMMyyyy(LocalDate date) {
        return date.format(formatter1);
    }

    public static String toString_yyyyMMdd(LocalDate date) {
        return date.format(formatter2);
    }
}
