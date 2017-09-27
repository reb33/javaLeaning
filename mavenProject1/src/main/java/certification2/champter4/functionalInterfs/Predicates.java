package certification2.champter4.functionalInterfs;

import java.util.function.Predicate;

/**
 * Created by konstantin on 14.09.2017.
 */
public class Predicates {
    public static void main(String[] args) {
        Predicate<String> pe = (String s) -> s.startsWith("eggs");
        Predicate<String> pb = s -> s.contains("brown");

        Predicate<String> pp1 = pe.and(pb);
        Predicate<String> pp2 = pe.and(pb.negate());


        Predicate<String> pp11 = ((Predicate<String>)s -> s.startsWith("eggs"))
                .and(s -> s.contains("brown"));
        Predicate<String> pp21 = ((Predicate<String>)s -> s.startsWith("eggs"))
                .and(((Predicate<String>) s -> s.contains("brown")).negate());

        System.out.println(pp1.test("eggs brown"));
        System.out.println(pp11.test("eggs brown"));
        System.out.println(pp2.test("eggs brown"));
        System.out.println(pp21.test("eggs brown"));
    }
}
