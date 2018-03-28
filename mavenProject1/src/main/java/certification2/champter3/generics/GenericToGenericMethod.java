package certification2.champter3.generics;

import org.apache.commons.lang3.ObjectUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// в классе нельзя использовать lower bound
public class GenericToGenericMethod/*<L super Number>*/ {

    static private <T extends Number> void m1(List<T> t){}
    // в методе нельзя использовать lower bound
//    static private <T super Integer> void m2(List<T> t) {}

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Number> list2 = new ArrayList<>();
        List<?> list3 = new ArrayList<>(Arrays.asList(1,"",3.2));
        List<? extends Number> list4 = new ArrayList<Integer>();
        List<? extends Integer> list5 = new ArrayList<>();
        List<? super Number> list6 = new ArrayList<>();
        List<? super Integer> list7 = new ArrayList<>();
        List list8 = new ArrayList();
        List<Object> list9 = new ArrayList<>();

        m1(list1);
        m1(list2);
        //  c <?> -ошибка комп
//        m1(list3);
        m1(list4);
        m1(list5);
        // с lower bound не работает если нужен upper
//        m1(list6);
//        m1(list7);
        // без типа компилится, если указать Object – не компилится
        m1(list8);
//        m1(list9);
    }
}
