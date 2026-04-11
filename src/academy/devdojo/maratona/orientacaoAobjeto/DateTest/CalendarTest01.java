package DateTest;

import java.util.Calendar;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 1); // Adiciona um dia
        System.out.println(calendar.getTime());
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("O primeiro dia da semana é Domingo");
        } else {
            System.out.println("O primeiro dia da semana não é Domingo");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendar.set(Calendar.DAY_OF_MONTH, 15);
        System.out.println(calendar.getTime());
        calendar.roll(Calendar.HOUR_OF_DAY, 12);
        System.out.println(calendar.getTime());
    }
}
