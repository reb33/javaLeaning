package certification2.champter3.collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by konstantin on 13.09.2017.
 */
public class SortingString {

    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>(Arrays.asList("One", "one", "ONe", "ONE"));
        System.out.println(set1);

        Set<String> set2 = new TreeSet<>(Arrays.asList("Ones", "One", "On", "O"));
        System.out.println(set2);

        Set<String> set3 = new TreeSet<>(Arrays.asList("1", "3", "2", "4"));
        System.out.println(set3);

    }
}
