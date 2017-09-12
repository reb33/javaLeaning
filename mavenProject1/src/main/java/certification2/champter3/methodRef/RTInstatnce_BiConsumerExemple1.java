package certification2.champter3.methodRef;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by konstantin on 11.09.2017.
 */
public class RTInstatnce_BiConsumerExemple1 {

    public static void main(String[] args) {
        List<Integer> list1 = IntStream.range(1,10)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(list1);
    }
}
