package DateTest;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date();//Long time = System.currentTimeMillis();
        date.setTime(date.getTime() + 1000 * 60 * 60 * 24); // Adiciona um dia
        System.out.println(date);
    }
}
