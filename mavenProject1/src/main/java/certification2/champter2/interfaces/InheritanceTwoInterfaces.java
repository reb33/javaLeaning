package certification2.champter2.interfaces;

/**
 * Created by konstantin on 18.08.2017.
 */
public class InheritanceTwoInterfaces{
    public static void main(String[] args) {

    }

}

interface I3{
    void m1();
    void m2();
    default void m3(){}
    void m4();
    void m5();
}

interface I4{
    default void m1(){}
    static void m2(){}
    static void m3(){}
    void m4();
    default void m5(){}
}

interface I5 extends I3, I4{
    @Override
    default void m1() {

    }
    void m5();
}

class Class1 implements I3, I4{
    @Override
    public void m1() {}
    @Override
    public void m4() {}
    @Override
    public void m5() {}
    @Override
    public void m2(){}
}
