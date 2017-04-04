package certification.champter3;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by konstantin on 24.03.2017.
 */
public class Exam1Dates {
//    private static final Map<Long, String> MONTH_OF_YEARS = ImmutableMap.<Long, String>builder()
//            .put(1l,"января").build();
    private static final Map<Long, String> MONTH_OF_YEARS = new HashMap<>();
    static {
        MONTH_OF_YEARS.put(1l, "января");
        MONTH_OF_YEARS.put(2l, "февраля");
        MONTH_OF_YEARS.put(3l, "марта");
        MONTH_OF_YEARS.put(4l, "апреля");
        MONTH_OF_YEARS.put(5l, "мая");
        MONTH_OF_YEARS.put(6l, "июня");
        MONTH_OF_YEARS.put(7l, "июля");
        MONTH_OF_YEARS.put(8l, "августа");
        MONTH_OF_YEARS.put(9l, "сентября");
        MONTH_OF_YEARS.put(10l, "октября");
        MONTH_OF_YEARS.put(11l, "ноября");
        MONTH_OF_YEARS.put(12l, "декабря");
    }

    public static void main(String[] args) {


        DateTimeFormatter d = new DateTimeFormatterBuilder()
//                .appendLiteral("z dnia ")
                .appendValue(ChronoField.DAY_OF_MONTH)
                .appendLiteral(" ")
                .appendText(ChronoField.MONTH_OF_YEAR, MONTH_OF_YEARS)
                .appendLiteral(" ")
                .appendValue(ChronoField.YEAR_OF_ERA)
                .toFormatter();
        LocalDate ld = LocalDate.of(2017,3,24);
        System.out.println(ld.format(d));
        System.out.println(LocalDate.of(2015, 4, 25));
    }
}
