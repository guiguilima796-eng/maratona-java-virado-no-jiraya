package Rdatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDate.now().atStartOfDay();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusDays(10);
        Period p1 = Period.between(now.toLocalDate(), nowAfterTwoYears.toLocalDate());
        System.out.println(p1);
        Period p2 = Period.ofDays(10);
        System.out.println(p2);
        Period p3 = Period.ofYears(1);
        System.out.println(p3);
        Period p4 = Period.ofMonths(4);
        System.out.println(p4);
        Period p5 = Period.ofWeeks(52);
        System.out.println(p5);
        System.out.println("1 ano tem "+ Period.ofYears(1)+" Dias!");
        Period p6 = Period.ofDays(365);
        System.out.println(p6);
    }
}
