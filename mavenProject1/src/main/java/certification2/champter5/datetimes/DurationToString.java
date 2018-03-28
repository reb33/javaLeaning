package certification2.champter5.datetimes;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * Created by Konstantin on 13.10.2017.
 */
public class DurationToString {

    //Duration toString ПЕРЕВОДИТ секунды в минуты, минуты в часы
    public static void main(String[] args) {
        System.out.println("Duration.ofSeconds(73)\t\t"+Duration.ofSeconds(73));
        System.out.println("Duration.ofSeconds(3773)\t"+Duration.ofSeconds(3773));
        System.out.println("Duration.ofMillis(4500)\t\t"+Duration.ofMillis(4500));
        System.out.println("Duration.ofMillis(5)\t\t"+Duration.ofMillis(5));
        System.out.println("Duration.ofDays(0)\t\t\t"+Duration.ofDays(0));
        System.out.println(Duration.ofSeconds(45561));
    }
}
