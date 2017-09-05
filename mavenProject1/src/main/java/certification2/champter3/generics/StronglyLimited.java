package certification2.champter3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by konstantin on 04.09.2017.
 */
public class StronglyLimited {

    void m1(){
        List<Number> listNumber = new ArrayList<>();
        List<Integer> listUnt = new ArrayList<>();

        /*upper bound можно указать при объявлении переменной*/
        List<? extends Number> listNumber2 = new ArrayList<>(Arrays.asList(3, 2, 5, 2.6));

        List<Comparable> listCompa = new ArrayList<>();

        /*Можно добавлять подклассы*/
        listNumber.add(3);
        listNumber.add(1.0);
        /*upper bound можно указать при объявлении переменной, но добавить в такой список ничего не получится*/
//        listNumber2.add(3);

        listCompa.add(Integer.valueOf(3));

        /*нельзя*/
//        listNumber = listUnt;

        listNumber.addAll(listUnt);

        m2(listNumber);
        /*нельзя указывать подкласс при вызове если не использовалось upper bounds*/
//        m2(listUnt);

        m3(listNumber);
        m3(listUnt);

        m4(listUnt);
    }

    void m2 (List<Number> list){

    }

    void m3 (List<? extends Number> list){}

    void m4 (List<? extends Comparable> list){}

    void m5(List<? super Integer> list){
        list.add(3);
    }
}
