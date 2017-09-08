package certification2.champter3.collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by konstantin on 06.09.2017.
 */


/*
* HashMap - сохраняет в произвольном порядке
* LinkedHashMap - в порядке добавления
* TreeMap - в отсортированном порядке*/
public class MapsListOfValues {
    public static void main(String[] args) {
        Map<Integer, String> map =
            IntStream.range(60,91)
                    .boxed()
                    .collect(Collectors.toMap(Function.identity(),
                            i-> String.valueOf((char)i.intValue()),
                            (val, val1) -> val1,
//                            LinkedHashMap::new));
//                            TreeMap::new));
                            HashMap::new));
        map.put(20, "A1");
        List<String> list = new ArrayList<>(map.values());
        System.out.println(list);
    }
}
