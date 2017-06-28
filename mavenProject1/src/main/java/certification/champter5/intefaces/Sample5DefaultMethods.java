package certification.champter5.intefaces;

/**
 * Created by Konstantin on 10.05.2017.
 */
public class Sample5DefaultMethods implements OneInter5, TwoInter5{
    @Override
    public void method1() {
        System.out.println("method1_class");
    }

    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        secondClass.method1();
    }
    public Integer m2(){return 0;}

}

interface OneInter5{
    default void method1(){
        System.out.println("method1");
    }
    default Number m2(){return null;}
}
interface TwoInter5{
    default void method1(){
        System.out.println("method1_2");
    }
    default Integer m2(){return 0;}
}
interface TheeInter5 extends OneInter5, TwoInter5{
//    void method1(); можно сделать абстрактным
    @Override
    default void method1(){
        System.out.println("method1_3");
    }
    Integer m2();

}

abstract class abstractClass implements OneInter5, TwoInter5{
    @Override
    public abstract void method1();
    public abstract Integer m2();
}
interface FourInter5 extends OneInter5/*, TwoInter5*/{

}

class SecondClass implements FourInter5{}