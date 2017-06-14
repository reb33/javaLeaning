package certification.champter3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by konstantin on 14.06.2017.
 */
public class Sample17Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
        }
        Collection<Iterator> c = new ArrayList<>();
        for (Iterator i:c){}
    }
}
