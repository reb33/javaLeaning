package certification.champter4;

import java.util.function.Predicate;

/**
 * Created by konstantin on 24.03.2017.
 */
public class Exam2lambda{

    public static void main(String[] args) {
        System.out.println(test(i -> i==5));
//        System.out.println(test(i -> {i==5;}));
        System.out.println(test((i) -> i==5));
        System.out.println(test((Integer i) -> i==5));
//        System.out.println(test((int i) -> {return i==5;}));
        System.out.println(test(i -> {return i==5;}));
    }

    private static boolean test(Predicate<Integer> p){
        return p.test(5);
    }


}
