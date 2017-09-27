package certification2.tricks;

/**
 * Created by konstantin on 12.09.2017.
 */
public class AllowableParametrs {
    static void m2(double d){
        System.out.println("double");
    }
    static void m3(Double d){
        System.out.println("Double");
    }
    static void m1(long l){
        System.out.println("m1 long");
    }
    static void m4(float l){
        System.out.println("m4 float");
    }

    public static void main(String[] args) {
        /*m2 подходит т.к. применяется расширение*/
        m2(3L);

        /*m3 не подходит т.к. нельзя одновремено применять расширение и autoboxing, допустимо только 1 преобразование*/
//        m3(3L);

        /*float в long не переводится*/
//        m1(1f);
        /*long во float переводится*/
        m4(1l);
    }
}
