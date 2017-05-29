package certification.champter5.intefaces;

/**
 * Created by Konstantin on 10.05.2017.
 */
public class Sample6Statics implements OneInter6 {
    public static void main(String[] args) {
        System.out.println(Sample6Statics.x1);
        System.out.println(x1);
        System.out.println(OneInter6.x1);
//        method1(); //static методы не наследуются
//        Sample6Statics.method1();
        OneInter6.method1();
        Sample6Statics s = new Sample6Statics();
//        s.method1(); //static методы не наследуются
    }
}

interface OneInter6{
    int x1=1;
    static void method1(){
        System.out.println("method1");
    }
//    int x2;    // должны быть инициированы с той же строке где объявлены
//    static {  //инициатор использовать нельзя
//        x2=2;
//    }
}