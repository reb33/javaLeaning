package certification2.champter5.datetimes;

import java.time.Period;

/**
 * Created by Konstantin on 13.10.2017.
 */
public class PeriodToString {

    //Period toString НЕ ПЕРЕВОДИТ дни в месяцы и месяцы в года
    public static void main(String[] args) {
        Period p1 = Period.ofDays(30);
        Period p2 = Period.ofDays(31);
        Period p3 = Period.ofDays(32);

        Period p4 = Period.ofMonths(12);

        System.out.println(p1+" "+p2+" "+p3+" "+p4);
        System.out.println(Period.ofDays(15789));
    }
}
