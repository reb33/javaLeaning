package certification2.champter4.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by konstantin on 15.09.2017.
 */
public class InaccessibilityStreamAfterTO {

    static void m1(Stream<Integer> stream){
        stream.collect(Collectors.toList());
        List<Integer> list = stream.filter(i -> i>5).collect(Collectors.toList());
        System.out.println(list);
    }

    public static void main(String[] args) {
        m1(Stream.of(1,6,7,81,11,23,13));
    }
}
