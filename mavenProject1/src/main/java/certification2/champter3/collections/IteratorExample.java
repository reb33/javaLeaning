package certification2.champter3.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

    public static void main(String[] args) {
        Set<Number> set = new HashSet<>();
        set.add(12);
        set.add(12L);
        set.add(null);
        set.add(13);
        set.add(0.1);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
