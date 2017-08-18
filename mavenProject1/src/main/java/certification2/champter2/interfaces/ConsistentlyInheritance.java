package certification2.champter2.interfaces;

/**
 * Created by konstantin on 18.08.2017.
 */
public class ConsistentlyInheritance implements I2{
    @Override
    public void m1() {

    }

    /*Все default методы совсех интерфейсов наследуются*/
    void m4(){
        this.m2();
        this.m3();
    }
}
abstract interface I1{
    void m1();
    default void m2(){}
}

/*Наследуются default и abstract методы - родительские методы можно вызвать через this в интерфейсе*/
interface I2 extends I1{
    default void m3(){
        m1();
        this.m2();
    }

}
