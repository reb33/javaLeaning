package certification2.champter3.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by konstantin on 27.09.2017.
 */
public class ForEachMethod {

    public static void main(String[] args) {
        Collection<Integer> c = new LinkedList<>(Arrays.asList(1,23,3));
        c.forEach(System.out::println);
    }
}
