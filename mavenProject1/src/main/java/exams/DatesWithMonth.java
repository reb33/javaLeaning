package exams;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by konstantin on 24.03.2017.
 */
public class DatesWithMonth {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("'z dnia' dd MMMM yyyy 'r.'");

        DateFormatSymbols dfs = sdf.getDateFormatSymbols();

        dfs.setMonths(
                new String[] {
                        "stycznia", "lutego", "marca", "kwietnia", "maja", "czerwca",
                        "lipca", "sierpnia", "września", "października", "listopada",
                        "grudnia"
                });

        sdf.setDateFormatSymbols(dfs);

        try {
            System.out.println(sdf.format(new SimpleDateFormat("dd.MM.yyyy").parse("24.03.2017")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
