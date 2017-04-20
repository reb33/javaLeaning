package certification.champter3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Created by konstantin on 17.04.2017.
 */
public class Sample6Periods {

    public static void main(String[] args) {
        Period wrong = Period.ofYears(1);
        wrong = Period.ofWeeks(7);

        System.out.println();

        LocalDateTime dt = LocalDateTime.now();
        dt = dt.plus(wrong);
        System.out.println(dt.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH")));
        Duration duration = Duration.ofHours(-5);
        dt = dt.minus(duration);
        System.out.println(dt.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH")));
    }
}
