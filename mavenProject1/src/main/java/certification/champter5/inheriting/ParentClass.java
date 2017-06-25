package certification.champter5.inheriting;

/**
 * Created by konstantin on 29.05.2017.
 */
public class ParentClass {
    int a=2;
    static int b = 3;
//    abstract int c =5;
    final int d =7;

    final static void m1(){}
}

class Sub extends ParentClass{
    static String b = "str";
    public int d = 9;
//    static void m1(){}
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println(sub.a);
        System.out.println(sub.b);
        System.out.println(sub.d);

        System.out.println();
        ParentClass p = new Sub();
        System.out.println(p.b);
        System.out.println(p.d);

//        Sub s = new ParentClass();
    }
}

abstract class Sub2 extends Sub{}

