package certification2.champter5.datetimes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringInFormatter {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Holiday: yyyy.MM.dd");
        System.out.println(formatter.format(ld));
    }
}
