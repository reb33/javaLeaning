package certification2.champter3.methodRef;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by konstantin on 11.09.2017.
 */
public class ParticularInstance {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,5));
        Set set = IntStream
                .range(0,10)
                .filter(list::contains)
                .collect(HashSet::new, AbstractSet::add, Set::addAll);
        System.out.println(set);

    }
}
