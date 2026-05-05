package academy.devdojo.maratona.orientacaoAobjeto.Rdatas;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    static void main() {
        Map<String, String> shortsId = ZoneId.SHORT_IDS;
        for (Map.Entry<String, String> entry : shortsId.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        //System.out.println(shortsId);
        System.out.println(ZoneId.systemDefault());

        ZoneId zoneIdTokyo = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneIdTokyo);

        LocalDateTime now = LocalDateTime.now();

        ZonedDateTime zonedDateTime = now.atZone(zoneIdTokyo);
        System.out.println(zonedDateTime);

        Instant  nowinstant = Instant.now();
        System.out.println(nowinstant);
        ZonedDateTime zonedDateTime2 = nowinstant.atZone(zoneIdTokyo);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset offsetManaus =  ZoneOffset.ofHours(-4);
        System.out.println(offsetManaus);
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);
    }
}
