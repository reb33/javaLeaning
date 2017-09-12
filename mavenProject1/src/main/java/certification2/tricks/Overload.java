package certification2.tricks;

/**
 * Created by konstantin on 11.09.2017.
 */
public class Overload {
    public static void main(String[] args) {
        /*short сначала переводится в long, потом во float*/
        m1((short)5);
        /*long во float не переводится*/
//        m1(1.0f);

    }
    static void m1(long l){
        System.out.println("long");
    }
    static void m1(float f){
        System.out.println("float");
    }
}
