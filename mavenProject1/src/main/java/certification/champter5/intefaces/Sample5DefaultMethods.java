package certification.champter5.intefaces;

/**
 * Created by Konstantin on 10.05.2017.
 */
public class Sample5DefaultMethods implements OneInter5, TwoInter5{
    @Override
    public void method1() {
        System.out.println("method1_class");
    }
}

interface OneInter5{
    default void method1(){
        System.out.println("method1");
    }
}
interface TwoInter5{
    default void method1(){
        System.out.println("method1_2");
    }
}
interface TheeInter5 extends OneInter5, TwoInter5{
//    void method1(); можно сделать абстрактным
    @Override
    default void method1(){
        System.out.println("method1_3");
    }
}

abstract class abstractClass implements OneInter5, TwoInter5{
    @Override
    public abstract void method1();
}
