package certification.champter4;

/**
 * Created by konstantin on 21.06.2017.
 */
public class Sample8InvokeMethodWithNull {

    void m1(Object o){
        System.out.println("m1_Object");
    }
    void m1(Number n){
        System.out.println("m1_Number");
    }
    void m1(Integer i){
        System.out.println("m1_Integer");
    }
//    void m1(String s){
//        System.out.println("m1_String");
//    }
    void m2(int i){
        System.out.println("m2_int");
    }
    void m2(Object o){
        System.out.println("m2_Object");
    }

    public static void main(String[] args) {
        Sample8InvokeMethodWithNull s = new Sample8InvokeMethodWithNull();
        s.m1(null);
        s.m2(null);
    }
}
