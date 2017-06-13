package certification.champter3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by konstantin on 06.06.2017.
 */
public class Sample16Dates8 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2015, 1, 1, 12,55);
        System.out.println(dt);
        LocalDateTime dt2 = dt.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(dt2);

        parsing();
    }

    public static void parsing(){
        LocalDate d = LocalDate.parse("2015-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(d);
    }
}
