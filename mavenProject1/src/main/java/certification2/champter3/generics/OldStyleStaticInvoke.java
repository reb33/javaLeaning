package certification2.champter3.generics;

/**
 * Created by konstantin on 13.09.2017.
 */
public class OldStyleStaticInvoke {

    static <T extends Exception>void print(T t){
        System.out.println(t.getMessage());
    }

    public static void main(String[] args) {
        OldStyleStaticInvoke.<NullPointerException>print(new NullPointerException("e"));
    }
}
