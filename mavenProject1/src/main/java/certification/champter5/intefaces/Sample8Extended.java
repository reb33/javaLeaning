package certification.champter5.intefaces;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Konstantin on 13.05.2017.
 */
public class Sample8Extended implements TwoInter8 {
    @Override
    public void method4() {
    }
    @Override
    public void method5() {
    }
    @Override
    public void method6() throws FileNotFoundException {
    }
    @Override
    public void method1() {
    }
    @Override
    public void method3() {
    }
    public void method8(){
        TwoInter8.super.method8(); //super. указывает только на родительский класс, не на интерфейс
    }

    public static void main(String[] args) {
        Sample8Extended s = new Sample8Extended();
//        s.method7();
        s.method8();
    }
}

interface OneInter8{
    default void method1(){}
    void method2();
    static void method3(){}
    void method4();

    void method5();

    void method6() throws FileNotFoundException;
    default void method7(){
        System.out.println(this.getClass().getSimpleName()+" method7");
    }
    default void method8(){
        System.out.println(this.getClass().getSimpleName()+" method8");
        this.method2();
        this.method7();
//        this.method3();
    }
}
interface TwoInter8 extends OneInter8{
    void method1();
    default void method2(){
        System.out.println(this.getClass().getSimpleName()+" method2");
    }
    default void method3(){}
//    static void method4(){} //статический метод не может переопределить объектный метод

//    String method5(); несоответствующий тип

//    void method6() throws IOException; //ограничение с исключениями действует
    default void method8(){  //super. не работает
        OneInter8.super.method8();
    }
}