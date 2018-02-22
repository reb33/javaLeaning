package certification2.champter1.all_nested_classes.nested;

import static certification2.champter1.all_nested_classes.nested.Accessing.Nested.i3;

/**
 * Created by konstantin on 18.08.2017.
 */
public class Accessing {
    private void m1() {}
    private int oi1 =1;
    private static void om1(){}

    static class Nested{
        private int i1;
        private static int i2;
        static int i3;

        private static void m2(){}
        static void m3(){}
        void m4(){
            //члены внешнего класса доступны в nested
            new Accessing().m1();
            System.out.println(new Accessing().oi1);
            om1();
        }
    }

    public static void main(String[] args) {
        //для доступа к эл-ам nested класса ну но обращаться через объект или через имя класса(если статичны)
        //можно указать статик импорт для доступа к статичным элеметам (i3 доступно, m3 не доступно)
        //можно указать статик импорт для всего класса через Nested.*
        // при этом будут импортированы все элементы кроме private
        // в том же классе можно указать статик импорт для приватных элементов,
        // но только отдельный импорт для каждого
        Nested nested = new Nested();
        System.out.println(nested.i1);
        System.out.println(Nested.i2);
//        i2++;
        Nested.i3+=1;

        i3++;
        Nested.m2();
//        m2();
//        m3();
    }
}

class Class1{
    void m1(){
        System.out.println(Accessing.Nested.i3);
    }
}
