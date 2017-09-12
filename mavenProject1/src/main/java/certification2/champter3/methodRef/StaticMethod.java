package certification2.champter3.methodRef;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by konstantin on 11.09.2017.
 */
public class StaticMethod {
    public static void main(String[] args) {

        List<String> list = IntStream
                .range(0,10)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
