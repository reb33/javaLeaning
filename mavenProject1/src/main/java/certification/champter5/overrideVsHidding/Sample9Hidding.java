package certification.champter5.overrideVsHidding;

import java.io.IOException;

/**
 * Created by konstantin on 15.05.2017.
 */
public class Sample9Hidding extends ParentClass2 {
    void method1(){
        System.out.println("child method1");
    }
    int a1 = 20;
    private int a2=33;

//    static int method2(){return 0;} //несовместимые типы при сокрытии
//    static void method3(){} //уменьшение доступности при сокрытии
//    static void method4() throws Exception{} //расширение исключения
}

class ParentClass2{
    private void method1(){
        System.out.println("parent method1");
    }
    int a1 = 10;
    int a2 = 22;

    static void method2(){}
    public static void method3(){}
    static void method4() throws IOException{}
    public static void main(String[] args) {
        ParentClass2 s = new Sample9Hidding();
        s.method1();
        System.out.println(s.a1);
    }
}

class Sub extends Sample9Hidding{
    void print(){
//        System.out.println(a2); //
        System.out.println(((ParentClass2)this).a2);
    }
}