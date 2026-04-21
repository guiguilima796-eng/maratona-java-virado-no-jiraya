package academy.devdojo.maratona.orientacaoAobjeto.Rdatas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest02 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = now.plusYears(2);
        LocalTime nowTime = LocalTime.now();
        LocalTime timeMinutes7Hours = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(now,nowAfterTwoYears);
        System.out.println(d1);
    }
}
