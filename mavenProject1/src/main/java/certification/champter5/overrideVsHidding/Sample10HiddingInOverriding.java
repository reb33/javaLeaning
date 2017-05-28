package certification.champter5.overrideVsHidding;

/**
 * Created by konstantin on 26.05.2017.
 */
public class Sample10HiddingInOverriding extends Parent{
    void method1(){
        staticMethod();
        System.out.println(length);
    }
    static void staticMethod(){
        System.out.println("Child");
    }
    int length = 10;

}

class Parent{
    void method1(){
        staticMethod();
        System.out.println(length);
    }
    static void staticMethod(){
        System.out.println("Parent");
    }
    int length = 20;

    public static void main(String[] args) {
        Parent p = new Sample10HiddingInOverriding();
        p.method1();
    }
}
