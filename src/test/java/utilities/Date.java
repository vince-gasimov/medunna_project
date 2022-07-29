package utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {

    public static String todaysDate(){
        LocalDate todaysData = LocalDate.now();
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String today = todaysData.format(datePattern);
        return today;
    }
    public static String tomorrowsDate(){
        LocalDate tomorrowsDate = LocalDate.now().plusDays(1);
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String tomorrow = tomorrowsDate.format(datePattern);
        return tomorrow;
    }
    public static String passedDate() {
        LocalDate olderDate = LocalDate.now().minusMonths(3).minusDays(5).minusYears(20);
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String passed = olderDate.format(datePattern);
        return passed;
    }

    public static String passedDate2() {
        LocalDate olderDate = LocalDate.now().minusMonths(3).minusDays(5).minusYears(2);
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String passed = olderDate.format(datePattern);
        return passed;
    }




    public static String futureDate() {
        LocalDate futureDate = LocalDate.now().plusDays(3).plusDays(5).plusYears(1);
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String future = futureDate.format(datePattern);
        return future;
    }

    public static String futureDate2() {
        LocalDate futureDate = LocalDate.now().plusDays(3).plusDays(5).plusYears(1);
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String future = futureDate.format(datePattern);
        return future;
    }

}
