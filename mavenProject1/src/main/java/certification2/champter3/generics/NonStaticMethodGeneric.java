package certification2.champter3.generics;

/**
 * Created by konstantin on 13.09.2017.
 */
public class NonStaticMethodGeneric {
    <T>void m1(T t){
        System.out.println(t.toString());
    }
}
