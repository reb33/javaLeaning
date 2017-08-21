package certification2.champter2.interfaces;

/**
 * Created by konstantin on 18.08.2017.
 */
public class InheritanceTwoInterfaces{
    public static void main(String[] args) {

    }

}

interface I3{
    /* def - abs то в интерфейсе надо переопределить.
     как и в случае с def - def. Классе метод так же должен быть переопределен*/
    void m1();
    /*abs - static в интерфейсе можно не переопределять. в классе должен быть переопределен*/
    void m2();
    /*def - static в интерфейсе можно не переопределять, в классе можно не переопределять*/
    default void m3(){}
    /*abs - abs в интерфейсе можно не переопределять, в классе нужно переопределить*/
    void m4();
    void m5();
    /*def - def в интерфейсе должен быть переопределен, в классе должен быть переопределен*/
    default void m6(){}
}

interface I4{
    default void m1(){}
    static void m2(){}
    static void m3(){}
    void m4();
    default void m5(){}
    default void m6(){}
}

interface I5 extends I3, I4{
    @Override
    default void m1() {

    }
    void m5();

    @Override
    default void m6() {

    }
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

    @Override
    public void m6() {

    }
}
