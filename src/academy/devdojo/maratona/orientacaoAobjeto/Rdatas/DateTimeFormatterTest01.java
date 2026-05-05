package academy.devdojo.maratona.orientacaoAobjeto.Rdatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse(s1, DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse(s2, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate parse3 = LocalDate.parse(s3, DateTimeFormatter.ISO_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);
        LocalDateTime dateTime = LocalDateTime.now();
        String s4 = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDateTime.now().format(formatterBR);
        System.out.println(LocalDateTime.now());
        System.out.println(formatBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.GERMAN);
        String formatGR = LocalDateTime.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse(formatGR, formatterGR);
        System.out.println(parseGR);

    }
}
