package certification.champter4.lamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by konstantin on 05.06.2017.
 */
public class Test2 {

    void m1(List<String> l, Predicate<List> p){
        if (p.test(l))
            System.out.println(l);
    }
    void m2(String s, Predicate<String> p){
        if (p.test(s))
            System.out.println(true);
        else
            System.out.println(false);
    }

    public static void main(String[] args) {
        List<String> l = new ArrayList<>(Arrays.asList("qwe", "asd", "zxc"));
        Test2 t = new Test2();
//        t.m1(l, (ArrayList el)->el.contains("asd"));   //
        List<String> l2 = new ArrayList<>(Arrays.asList("111","222","333"));

        t.m1(l2, el->el.add("asd"));
        System.out.println(l);
        System.out.println(l2);

        String str = "test";
        String str2 = "est";
        t.m2(str2, s -> s.startsWith("t"));

    }
}


