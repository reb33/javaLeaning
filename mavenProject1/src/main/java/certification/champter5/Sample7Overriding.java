package certification.champter5;

import java.util.zip.DataFormatException;

/**
 * Created by Konstantin on 10.05.2017.
 */
class ParentClass{
    protected void method1(){
        System.out.println("parent method1");
    }
    ret2 method2(){return null;}
    void method3() throws exc2{}
    long method4(){return 9;}
    void method(){
        method1();
    }
}

public class Sample7Overriding extends ParentClass {
//    void method1(){}
//    private method1(){}

    protected void method1(){
        super.method1();
        System.out.println("child method1");
    }
//    ret1 method2(){return null;}
    ret2 method2(){return null;}
//    void method3() throws exc1{}
//    void method3() throws exc2, DataFormatException{}
    void method3() throws exc3, RuntimeException{}
//    int method4() {return 9;}

    public static void main(String[] args) {
        ParentClass s = new Sample7Overriding();
        s.method();
    }
}

class SubClass extends Sample7Overriding{
    public void method1(){}
    ret3 method2(){return null;}
    void method3(){}
}

class ret1{}
class ret2 extends ret1{}
class ret3 extends ret2{}

class exc1 extends Exception{}
class exc2 extends exc1{}
class exc3 extends exc2{}
