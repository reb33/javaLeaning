package certification2.champter3.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by konstantin on 13.09.2017.
 */
public class InCollections {

    void m1(){
        List<?> list = new ArrayList<>();
//        List<T> list1 = new List<>()
    }
    <T> void m2(List<T> list){}
}
