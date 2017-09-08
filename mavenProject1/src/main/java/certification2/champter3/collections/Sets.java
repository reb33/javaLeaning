package certification2.champter3.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

/**
 * Created by konstantin on 06.09.2017.
 */
public class Sets {
    public static void main(String[] args) {
        Set<String> set =
                IntStream.range(60, 91)
                .boxed()
                .collect(
//                        HashSet::new,
//                        LinkedHashSet::new,
                        TreeSet::new,
                        (values, i) -> values.add(String.valueOf((char)i.intValue())),
                        (set1, set2) -> set1.addAll(set2));

        set.add("S1");

        System.out.println(set);
    }
}
