package certification2.champter5.datetimes;

import java.time.Duration;
import java.time.LocalDate;

/**
 * Created by konstantin on 29.09.2017.
 */
public class Durations {

    public static void main(String[] args) {
        Duration d = Duration.ofDays(1);
        LocalDate.now().plus(d);
    }
}
