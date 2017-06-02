package certification.champter5.inheriting;

import certification.champter5.checkPakageOverriding.a.Parent;

/**
 * Created by konstantin on 02.06.2017.
 */
public class Sample10WithConstructors {
    public static void main(String[] args) {
        Sub10 s = new Sub10();
        s.print();
        ((Parent10)s).print();
    }
}

class Parent10{
    Parent10(){
        print();
    }
    void print(){
        System.out.println("A");
    }
}
class Sub10 extends Parent10{
    final int i;
    Sub10(){
        print();
        i=10;
    }
    void print(){
        System.out.println(i);
    }
}
