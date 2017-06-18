package certification.champter3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by konstantin on 18.04.2017.
 */
public class Sample7Lists {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        List<Object> list2 = (List<Object>)list;

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(null);
        System.out.println(list1.get(2));
        int x = list1.get(0);
        int y = list1.get(1);
//        int z = list1.get(2); //NullPointerException

        List<Byte> listByte = new ArrayList<>();
        listByte.add((byte)1);
        List<Double> listDouble  = new ArrayList<>();
//        listDouble.add(111);
        listDouble.add(1d);

        String str;
        System.out.println(listDouble.contains("111"));
    }
}
