package certification2.champter3.generics;

import java.util.List;

/**
 * Created by konstantin on 04.09.2017.
 */
public class BecomeImmutable {

    void m1(List<? extends Number> list){
        /*нельзя добавить элемент к списку*/
//        list.add(Integer.valueOf(3));
//        list.add((Number)Integer.valueOf(3));


        list.remove(0);
    }

    void m5(List<? super Integer> list){
        list.add(3);
//        list.add(1.0);
    }
}
