package academy.devdojo.maratona.orientacaoAobjeto.Rdatas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustTest01 {
    static void main() {
        LocalDate now = LocalDate.now();
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("Primeiro Dia do mês : " + now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Ultimo Dia do Mês : "+now);
        System.out.println(now.getDayOfWeek());

        LocalDate now2 = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Próxima Terça : "+now2);

        now = now.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("Primeiro Dia do Próximo Ano : "+now);
        System.out.println("Primeiro Dia do Próximo Ano : "+now.getDayOfWeek());

    }
}
