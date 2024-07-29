package ss3_static.localdateutil;

import java.time.LocalDate;

public class LocalDateUtilManagement {
    public static void main(String[] args) {
        String dateString1 = "15/05/1998";
        String dateString2 = "2022/05/12";

        LocalDate date1 = LocalDateUtil.fromString_ddMMyyyy(dateString1);
        LocalDate date2 = LocalDateUtil.fromString_yyyyMMdd(dateString2);

        System.out.println("LocalDate tu chuoi dd/MM/yyyy: " + date1);
        System.out.println("LocalDate tu chuoi yyyy/MM/dd: " + date2);

        LocalDate currentDate = LocalDate.now();

        String formatterDate1 = LocalDateUtil.toString_ddMMyyyy(currentDate);
        String formatterDate2 = LocalDateUtil.toString_yyyyMMdd(currentDate);

        System.out.println("Chuoi tu LocalDate (dd/MM/yyyy): " + formatterDate1);
        System.out.println("Chuoi tu LocalDate (yyyy/MM/dd): " + formatterDate2);
    }
}
