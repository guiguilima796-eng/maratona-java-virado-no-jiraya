package academy.devdojo.maratona.orientacaoAobjeto.Rdatas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        LocalDate data = LocalDate.from(temporal);
        DayOfWeek diaSemana = data.getDayOfWeek();
        if (diaSemana == DayOfWeek.TUESDAY) {
            return temporal.plus(4, ChronoUnit.DAYS);
        } else if (diaSemana == DayOfWeek.FRIDAY) {
            return temporal.plus(3, ChronoUnit.DAYS);
        } else if (diaSemana == DayOfWeek.SATURDAY) {
            return temporal.plus(2, ChronoUnit.DAYS);
        } else {
            return temporal.plus(1, ChronoUnit.DAYS);
        }
    }

}

public class TemporalAdjusterTest02 {
    static void main() {
        LocalDate now = LocalDate.now();
        ObterProximoDiaUtil diaUtil = new ObterProximoDiaUtil();
        now = LocalDate.now().withDayOfMonth(23).with(new ObterProximoDiaUtil());
        System.out.println("Próximo dia útil : "+now);

        now = LocalDate.now().withDayOfMonth(24).with(new ObterProximoDiaUtil());
        System.out.println("Próximo dia útil : "+now);

        now = LocalDate.now().withDayOfMonth(25).with(new ObterProximoDiaUtil());
        System.out.println("Próximo dia útil : "+now);

        now = LocalDate.now().withDayOfMonth(26).with(new ObterProximoDiaUtil());
        System.out.println("Próximo dia útil : "+now);
    }
}
