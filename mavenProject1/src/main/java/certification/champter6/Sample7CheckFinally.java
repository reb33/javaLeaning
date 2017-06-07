package certification.champter6;

/**
 * Created by konstantin on 18.05.2017.
 */
public class Sample7CheckFinally {
    void method1_2(){
        throw new RuntimeException();
    }
    void method1(){
        try{
            method1_2();
        }finally {
            System.out.println("111111method1");
        }
    }

    public static void main(String[] args) {
        Sample7CheckFinally s = new Sample7CheckFinally();
        s.m3();
        s.m4();
        try {
            new Sample7CheckFinally().method1();
        }
        finally {
            System.out.println("mainMethod11111");
        }
    }
    void m3(){
        try{
            return;
//            System.out.println();
        }finally {
            System.out.println("m3 finally");
        }
    }
    void m4(){
        try{
            throw new NullPointerException();
        }catch (NullPointerException e){
            return;
        }finally {
            System.out.println("m4 finally");
        }
    }
}
