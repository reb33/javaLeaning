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

//    static int method2(){return 0;} //несовместимые типы при сокрытии
//    static void method3(){} //уменьшение доступности при сокрытии
//    static void method4() throws Exception{} //расширение исключения
}

class ParentClass2{
    private void method1(){
        System.out.println("parent method1");
    }
    int a1 = 10;

    static void method2(){}
    public static void method3(){}
    static void method4() throws IOException{}
    public static void main(String[] args) {
        ParentClass2 s = new Sample9Hidding();
        s.method1();
        System.out.println(s.a1);
    }
}