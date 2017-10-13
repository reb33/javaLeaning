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

        System.out.println("\nm2:");
        m1();
        m2();
        m4();
    }

    static void m1(){
        List list = new ArrayList<Integer>();
        for (Object i:list){}
    }

    static void m2(){
        List<Integer> list1=new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Object> list3 = new ArrayList<>();

        System.out.println(list1.getClass() == list2.getClass());
        System.out.println(list1.equals(list2));
        System.out.println(list2.getClass() == list3.getClass());
        System.out.println(list3.equals(list2));
    }

    static void m3(){
        List<Number> list = new ArrayList();
        list.add(new Integer(3));
        list.add(new Double(3));
        list.add(3f);
        list.add(5d);
    }
    static void m4(){
        System.out.println("\nm4:");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.remove(1);
        System.out.println(list);
    }
}
