package certification.champter5.intefaces;

/**
 * Created by Konstantin on 10.05.2017.
 */
public class Sample6Statics implements OneInter6 {
//    static int y=5;
    public static void main(String[] args) {
        System.out.println(Sample6Statics.x1);
        System.out.println(x1);
        System.out.println(OneInter6.x1);
//        System.out.println(y);
//        System.out.println(Sample6Statics.y);
//        method1(); //static методы не наследуются
//        Sample6Statics.method1();
        OneInter6.method1();
        Sample6Statics s = new Sample6Statics();
//        s.method1(); //static методы не наследуются

        TwoInter6.m1();
    }
}

interface OneInter6 extends TwoInter6, ThreeInter6{ //ошибка при наследовании одинаковых переменных из интерфейсов
    int x1=1;
//    int y=1;
    static void method1(){
        System.out.println("method1");
    }
//    int x2;    // должны быть инициированы с той же строке где объявлены
//    static {  //инициатор использовать нельзя
//        x2=2;
//    }

}

interface TwoInter6{
    int y=5;
    static void m1(){
        System.out.println("TwoInter6");
    }
}

interface ThreeInter6{
    int y=10;
    static void m1(){
        System.out.println("ThreeInter6");
    }
}