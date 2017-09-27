package certification2.tricks;

/**
 * Created by konstantin on 11.09.2017.
 */
public class Overload {
    public static void main(String[] args) {
        /*short сначала переводится в long, потом во float*/
        m1((short)5);
        /*float в long не переводится*/
//        m1(1.0f);

        /*метод выбирается от типа переменной*/
        Object obj = 3;
        m2(obj);

    }
    static void m1(long l){
        System.out.println("long");
    }
    static void m1(float f){
        System.out.println("float");
    }

    static void m2(Object obj){
        System.out.println("m2 Object "+obj.getClass());
    }
    static void m2(Integer i){
        System.out.println("m2 Integer");
    }
}
