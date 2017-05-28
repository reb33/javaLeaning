package certification.champter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by konstantin on 23.05.2017.
 */
public class Sample12DateFormatter {

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println(dateTimeFormatter.format(localDateTime));
//        System.out.println(dateTimeFormatter.format(localDate)); //UnsupportedTemporalTypeException


//        System.out.println(dateTimeFormatter.format(localTime)); //UnsupportedTemporalTypeException

        DateTimeFormatter dateTimeFormatter_time =DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println(dateTimeFormatter_time.format(localTime));
        
    }
}
