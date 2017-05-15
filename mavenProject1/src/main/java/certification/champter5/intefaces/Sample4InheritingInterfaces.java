package certification.champter5.intefaces;

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
    public String fourMethod() {
        return null;
    }

    @Override
    public void fiveMethod() {

    }

    public static void main(String[] args) {
        Sample4InheritingInterfaces s= new Sample4InheritingInterfaces();
        s.oneMethod();
        s.twoMethod();

        OneInter o = new Sample4InheritingInterfaces();
        TwoInter t = new Sample4InheritingInterfaces();
    }
}

abstract class ParentClass implements OneInter, TwoInter{}

interface OneInter{
    void oneMethod();
    void threeMethod();
    String fourMethod();
    void fiveMethod() throws DataFormatException;
    default void sixMethod(){}
    static void sevenMethod(){}
}
interface TwoInter{
    void twoMethod();
    void threeMethod();
//    Objects fourMethod();
    void fiveMethod() throws NumberFormatException;
//    void sixMethod(); //запрещено abstract и default с одной сигнатурой
//    void sevenMethod(); //запрещено abstract и static с одной сигнатурой
}