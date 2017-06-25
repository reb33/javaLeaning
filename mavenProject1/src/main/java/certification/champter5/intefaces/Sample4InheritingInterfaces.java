package certification.champter5.intefaces;

import java.io.IOException;
import java.util.Objects;
import java.util.zip.DataFormatException;

/**
 * Created by Konstantin on 09.05.2017.
 */
public class Sample4InheritingInterfaces extends ParentClass /*implements OneInter, TwoInter*/{
    @Override
    public void oneMethod() {
        System.out.println("one");
    }

    @Override
    public void twoMethod() {
        System.out.println("two");
    }

    @Override
    public void threeMethod() {

    }

    @Override
    public Integer fourMethod() {
        return null;
    }   //переопределенные методы должны соответствовать 2 методам в интерфейсах

    @Override
    public void fiveMethod() {

    }

    public static void main(String[] args) {
        Sample4InheritingInterfaces s= new Sample4InheritingInterfaces();
        s.oneMethod();
        s.twoMethod();

        OneInter o = new Sample4InheritingInterfaces();
        TwoInter t = new Sample4InheritingInterfaces();
        System.out.println(o.VALUE);
        System.out.println(t.VALUE);
    }

    @Override
    public void m12() {

    }
}

abstract class ParentClass implements OneInter, TwoInter{
    abstract public void m12();
}

interface OneInter{
    int VALUE=10;
    void oneMethod();
    void threeMethod();
    Number fourMethod();
    void fiveMethod() throws DataFormatException;
    default void sixMethod(){}
    static void sevenMethod(){}
    static void eightMethod(){}
    default void nineMethod(){}
    default void m12(){}
}
interface TwoInter {
    int VALUE=20;
    void twoMethod();
    void threeMethod();
    Object fourMethod();
    void fiveMethod() throws IOException, Exception;
//   void sixMethod(); //запрещено abstract и default с одной сигнатурой
//    void sevenMethod(); //запрещено abstract и static с одной сигнатурой
    default int eightMethod(){return 0;}
    static int nineMethod(){return 0;}
    default void m12(){}
}

interface Int3 extends OneInter, TwoInter{
    void m12();
}
