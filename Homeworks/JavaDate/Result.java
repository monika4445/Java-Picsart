package Homeworks.JavaDate;

import java.time.LocalDate;

public class Result {

    public static String findDay(String month, String day, String year) {

        java.time.LocalDate lt = java.time.LocalDate.of(2011,12,31);
        return lt.getDayOfWeek().name();


    }}
//example 1


