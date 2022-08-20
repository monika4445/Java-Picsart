package Homeworks.JavaDate;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Dateclass {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getTime());


        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
//c.get()
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.getTime());
        c.set(2015, 9, 14);
        System.out.println(c.getTime());
        c.roll(Calendar.DATE, 50);
        System.out.println(c.getTime());


        LocalDate date = LocalDate.now(); //stexcvel e nor java.time 2014 tvakanin,miangamic stacan amis amstaiv taretiv
        System.out.println(date);

        LocalDate dd = LocalDate.of(2020, 5, 8); //stexcvel e nor java.time 2014 tvakanin,miangamic stacan amis amstaiv taretiv
        System.out.println(dd.minusMonths(4));

        LocalDate dd1 = LocalDate.of(2017, 6, 18); //stexcvel e nor java.time 2014 tvakanin,miangamic stacan amis amstaiv taretiv
        System.out.println(dd1.plusWeeks(3));

        LocalDateTime dt = date.atTime(12, 22, 30);
        System.out.println(dt);

        Date dr = new Date();
        System.out.println(dr);

        long time = dr.getTime(); //senc stanumenq jamanaky 1 rope heto
        time += 60 * 1000;
        dr.setTime(time);
        System.out.println(dr.toLocaleString());

        Date df = new Date();
        SimpleDateFormat cc = new SimpleDateFormat("yyyy-MM-dd hh:mm a");//ete uzumenq PM ov gri jamy a enq grum
        // koxky, ete 24 jamva hamakargov HH jamy mecatar
        System.out.println(cc.format(df));

        Date aa = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(aa);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.SECOND));
    }
}
