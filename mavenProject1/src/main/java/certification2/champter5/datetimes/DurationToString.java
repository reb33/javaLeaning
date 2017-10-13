package certification2.champter5.datetimes;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * Created by Konstantin on 13.10.2017.
 */
public class DurationToString {

    //Duration toString ПЕРЕВОДИТ секунды в минуты, минуты в часы
    public static void main(String[] args) {
        Duration d1 = Duration.of(1, ChronoUnit.MINUTES);
        Duration d2 = Duration.ofMinutes(1);
        Duration d3 = Duration.of(60, ChronoUnit.SECONDS);
        Duration d4 = Duration.ofSeconds(60);

        Duration d5 = Duration.ofMinutes(60);

        Duration d6 = Duration.ofHours(24);

        Duration d7 = Duration.ofSeconds(3600);

        System.out.println(d1+" "+d2+" "+d3+" "+d4+" "+d5+" "+d6+" "+d7);
    }
}
