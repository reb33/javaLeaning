package certification2.champter1.all_nested_classes.nested;

import static certification2.champter1.all_nested_classes.nested.Accessing.Nested.*;

/**
 * Created by konstantin on 18.08.2017.
 */
public class Accessing {

    static class Nested{
        private int i1;
        private static int i2;
        static int i3;

        private static void m2(){}
        static void m3(){}
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.i1);
        System.out.println(Nested.i2);
        Nested.i3+=1;

        i3++;
//        m2();
        m3();
    }
}

class Class1{
    void m1(){
        System.out.println(Accessing.Nested.i3);
    }
}
