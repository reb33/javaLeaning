package certification.champter5.checkPakageOverriding.b;

import certification.champter5.checkPakageOverriding.a.Parent;

/**
 * Created by konstantin on 26.05.2017.
 */
public class Child extends Parent {

    void method1(){
        System.out.println("it's Child");
    }

    public static void main(String[] args) {
        Child p = new Child();
        p.method1();

//        Child c = (Child)new Parent();
    }
}
