package certification2.champter3.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * Created by konstantin on 12.09.2017.
 */
public class MapsThreeMethods {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> mapperMergeNull = (i1, i2) -> null;

        Map<String, Integer> counts = new HashMap<>();

        /*Если в merge value = null - NullPointerException*/
//        counts.merge("Ann", null, mapperMergeNull);
//        System.out.println(counts);

        counts.put("Ann", null);
        /*Если в мэп key=null то merge добавляет значение не вызываю BiFunction*/
        counts.merge("Ann", 1, mapperMergeNull);
        System.out.println(counts);
        /*Если в мэп key!=null а mapper ret null то merge удаляет key из мэп*/
        counts.merge("Ann", 1, mapperMergeNull);
        System.out.println(counts);

        counts.put("Ann", null);
        System.out.println(counts.computeIfPresent("Ann", (k, v) -> 1));
        System.out.println(counts);

    }
}
