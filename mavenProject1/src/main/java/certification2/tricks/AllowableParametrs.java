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

    public static void main(String[] args) {
        /*m2 подходит т.к. применяется расширение*/
        m2(3L);

        /*m3 не подходит т.к. нельзя одновремено применять расширение и autoboxing, допустимо только 1 преобразование*/
//        m3(3L);
    }
}
