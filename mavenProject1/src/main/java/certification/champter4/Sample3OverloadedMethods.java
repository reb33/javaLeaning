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
        s.method3(2,3,4,5,6);
        System.out.println(s.method3(1L, 2L, 3L, 4L));
        System.out.println(s.method3(2,3,4,5));

        s.method4(3);

        s.method5(4);

        s.method6(6L);
//        s.method6(2,3);



    }

    void method3(int... args){
        System.out.println("method3 varargs");
    }

    void method3(long i,int... args){
        System.out.println("method3 long, varargs");
    }

//    void method3(Integer... args){
//        System.out.println("method3 varargs Integer");
//    }

//    void method3(int[] args){} совпадает с предыдущим

    void method3(Integer i){
        System.out.println("method3 int");
    }
    void method3(float i){
        System.out.println("method3 float");
    }

    void method3(int i, int x){
        System.out.println("method3 2int");
    }

    void method3(long l, long l2, long l3){
        System.out.println("method3 3long");
    }

    String method3(long l, int i, Object o, double d){
        return "method3 long_intObject_double";
    }

    boolean method3(long l, float f, Object o, double d){
        System.out.println("method3 longfloatObject_double");
        return true;
    }
    boolean method3(long... l){
        System.out.println("varargs_longs");
        return false;
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

    /////////////////////////////////
    void method6(int x){
        System.out.println("method6 int");
    }

    void method6(Integer integer){
        System.out.println("method6 Integer");
    }

    void method6(Object object){
        System.out.println("method6 Object");
    }

    void method6(long xl){
        System.out.println("method6 long");
    }

    void method6(double xd){
        System.out.println("method6 double");
    }

    void method6(float xd){
        System.out.println("method6 float");
    }

    void method6(int... xarr){
        System.out.println("method6 varargs int");
    }

//    void method6(long... xlarr){
//        System.out.println("method6 varargs long");
//    }
//
//    void method6(double... xdarr){
//        System.out.println("method6 varargs double");
//    }
//
//    void method6(float... xfarr){
//        System.out.println("method6 varargs float");
//    }
//
//    void method6(Integer... xIarr){
//        System.out.println("method6 varargs Integer");
//    }

    void method6(Object... xoarr){
        System.out.println("method6 varargs Object");
    }

//    //////////////////////////////
//    void method7(Integer integer){
//        System.out.println("method7 Integer");
//    }
//
//    void method7(Object o){
//        System.out.println("method7 Object");
//    }
//
//    void method7(int i){
//        System.out.println("method7 int");
//    }
//
//    void method7(long l){
//        System.out.println("method7 long");
//    }
//
//    void method7(float f){
//        System.out.println("method7 float");
//    }
//
//    void method7(double d){
//        System.out.println("method7 double");
//    }
//
//    void method7(Integer... integerarr){
//        System.out.println("method7 varargs Integer");
//    }
//
//    void method7(int... iarr){
//        System.out.println("method7 varargs int");
//    }
//
//    void method7(Object... oarr){
//        System.out.println("method7 varargs object");
//    }
//
//    void method7(long... larr){
//        System.out.println("method7 varargs long");
//    }
}
