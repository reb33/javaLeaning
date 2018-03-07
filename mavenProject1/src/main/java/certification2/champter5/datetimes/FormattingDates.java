package certification2.champter5.datetimes;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingDates {

    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(14, 37);
        System.out.println(DateTimeFormatter.ofPattern("HH:mm").format(lt));
        System.out.println(DateTimeFormatter.ofPattern("hh:mm").format(lt));
//        System.out.println(DateTimeFormatter.ofPattern("hh:MM").format(lt));
    }
}
