package certification2.champter3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by konstantin on 04.09.2017.
 */
public class BecomeImmutable {

    static void m1(List<? extends String> list){
        /*нельзя добавить элемент к списку*/
//        list.add("Ann");
//        list.add((Number)Integer.valueOf(3));

        /*Удалять элементы можно*/
        list.remove("Ann");
    }

    static void m2(List<? extends Object> list){
        /*нельзя добавить элемент к списку*/
//        list.add("Ann");
//        list.add((Number)Integer.valueOf(3));

        /*Удалять элементы можно*/
        list.remove("Ann");
    }
    static void m3(List<?> list){
        /*нельзя добавить элемент к списку или изменять*/
//        list.add("Ann");
//        list.add((Number)Integer.valueOf(3));
//        list.set(1, "Ann");

        /*Удалять элементы можно*/
        list.remove("Ann");
    }

    void m5(List<? super Integer> list){
        list.add(3);
//        list.add(1.0);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Ann","Jane"));
        List<String> list1 = new ArrayList<>(Arrays.asList("Ann","Jane"));

        m1(list);
        System.out.println(list);
        m2(list);
        System.out.println(list);

        List<? extends String> list2 = new ArrayList<>(Arrays.asList("Ann","Jane","Kara"));
        /*Нельзя добавлять и изменять данные, удалять можно*/
//        list2.add("");
//        list2.set(1,"Daria");
        list2.remove(0);
        list2.remove("Jane");
        System.out.println(list2);
    }
}
