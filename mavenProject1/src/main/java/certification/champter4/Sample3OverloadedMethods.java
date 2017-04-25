package certification.champter4;

/**
 * Created by konstantin on 25.04.2017.
 */
public class Sample3OverloadedMethods {

    public void method1(){}

    static void method1(int i){}

    void print(short s){
        System.out.println("short");
    }

    void print(int i){
        System.out.println("integer");
    }

    public static void main(String[] args) {
        Sample3OverloadedMethods s = new Sample3OverloadedMethods();
        s.print(3);
        s.method3(1);
        s.method3(2,3);
        s.method3(2,4,5);

        s.method4(3);
//        s.method3();

        s.method5(4);

    }

    void method3(int... args){
        System.out.println("method3 varargs");
    }

//    void method3(int[] args){} совпадает с предыдущим

    void method3(int i){
        System.out.println("method3 int");
    }

    void method3(int i, int x){
        System.out.println("method3 2int");
    }

    void method4 (Integer integer){
        System.out.println("method4 Integer");
    }

    void method4 (int i){
        System.out.println("method4 int");
    }

    void method5 (Object o){
        System.out.println("method5 Object");
    }
}
