package academy.devdojo.maratona.orientacaoAobjeto.Rdatas;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {

    static void main() {
        LocalDate now = LocalDate.now();
        LocalDate aniversario = LocalDateTime.of(1990, 10, 20, 0, 0).toLocalDate();
        System.out.println("Dias do aniversario até o dia Atual : "+ ChronoUnit.DAYS.between(now, aniversario));
        System.out.println("Semanas do aniversario até o dia Atual : "+ ChronoUnit.WEEKS.between(now, aniversario));
        System.out.println("Meses do aniversario até o dia Atual : "+ ChronoUnit.MONTHS.between(now, aniversario));
        System.out.println("Anos do aniversario até o dia Atual : "+ ChronoUnit.YEARS.between(now, aniversario));
    }
}
