package certification.champter5.intefaces;

/**
 * Created by Konstantin on 13.05.2017.
 */
public class Sample8Extended {
}

interface OneInter8{
    default void method1(){}
    void method2();
    static void method3(){}
    void method4();

    void method5();
}
interface TwoInter8 extends OneInter8{
    void method1();
    default void method2(){}
    void method3();
//    static void method4(){} статический метод не может переопределить объектный метод

//    String method5(); несоответствующий тип
}