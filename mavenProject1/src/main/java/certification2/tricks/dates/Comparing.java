package certification2.tricks.dates;

import java.time.LocalDate;

/**
 * Created by konstantin on 19.09.2017.
 */
public class Comparing {

    public static void main(String[] args) {
        LocalDate f = LocalDate.now();
        LocalDate s = LocalDate.of(2016,12,31);
        System.out.println(s.compareTo(f));
        System.out.println(f.isAfter(s));
        System.out.println(s.isBefore(f));
    }
}
