package certification2.champter2.lamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by konstantin on 21.08.2017.
 */
public class CompatibleParameters {

    @FunctionalInterface
    private interface CheckList{
        boolean test(List<String> list);
    }

    private interface CheckList2{
        boolean test(Object o);
    }

    void test(List<String> list, CheckList checkList){
        System.out.println(checkList.test(list));
    }

    void test2(List<String> list, CheckList2 checkList){
        System.out.println(checkList.test(list));
    }

    void testFunction(int i, Predicate<Integer> f){
        System.out.println(f.test(i));
    }

    public static void main(String[] args) {
        CompatibleParameters c = new CompatibleParameters();
        List<String> list = Arrays.asList("1","2");

        /*если в методе требуется List
        в лямбда нельзя указать ArrayList*/
//        c.test(list, (ArrayList<String> l) -> l.isEmpty());
        c.test(list, l -> l.isEmpty());
//        c.test2(list, (List<String> l) -> ((List)l).isEmpty());
        c.test2(list, l -> ((List)l).isEmpty());

        c.testFunction(5, i -> i+3<10);
    }
}


