package certification.champter5.checkPakageOverriding.a;

import certification.champter5.checkPakageOverriding.b.Child;

/**
 * Created by konstantin on 26.05.2017.
 */
public class Parent {

    void method1(){
        System.out.println("it's Parent");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.method1();
    }
}
