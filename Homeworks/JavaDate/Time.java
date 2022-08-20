package Homeworks.JavaDate;

import java.util.Scanner;

import static Homeworks.JavaDate.ThatResult.findDay;

public class Time {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        System.out.println(findDay(day, month, year));


    } //amsativ amis tari inqnel qez tama shabatva ory
}
//example 2