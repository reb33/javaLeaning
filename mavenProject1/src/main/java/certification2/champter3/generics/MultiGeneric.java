package certification2.champter3.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by konstantin on 13.09.2017.
 */
public class MultiGeneric {

    void m1(List<? extends Comparable<? extends Number>> list){}

    void m2(){
        List<String> list = new ArrayList<>();
//        m1(list);
        List<Integer> list1 = new ArrayList<>();
        m1(list1);
    }
}
