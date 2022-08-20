package Homeworks.JavaDate;

import java.time.LocalDate;

public class ThatResult {
    public static String findDay(String month, String day, String year) {
        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);
        LocalDate lt = LocalDate.of(y, m, d);

        return lt.getDayOfWeek().name();


    }
}
//example 2