package certification2.champter3.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by konstantin on 12.09.2017.
 */
public class CheckSuper {

    <T extends Number> List<T> m1(T t){
        return new ArrayList<T>();
    }

    void m2(){
        List<? super Number> list = new ArrayList<>();
        list.add(new Integer(3));
    }

    class C1<T extends Number>{}
}
