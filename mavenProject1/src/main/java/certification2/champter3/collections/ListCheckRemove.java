package certification2.champter3.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by konstantin on 12.09.2017.
 */
public class ListCheckRemove {
    static void m1(List<? extends Object> list){
        list.remove(1.0);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Ann"));
        m1(list);
        System.out.println(list);
    }
}
