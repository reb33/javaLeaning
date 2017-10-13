package certification.champter5;

/**
 * Created by Konstantin on 27.06.2017.
 */
public class Sample10Super extends Parent10 {
    public static void main(String[] args) {
        Sample10Super s= new Sample10Super();
//        super.m1();
//        Parent10.super.m1()
    }
    void m1(){
        super.m1();
        super.m2();
        System.out.println(super.s1);
        System.out.println(super.s2);
        System.out.println(s1);
        System.out.println(s2);

    }
}
class Parent10{
    static String s1="str1";
    String s2="str2";
    void m1(){
        System.out.println("m1()");
    }
    static void m2(){
        System.out.println("m2()");
    }
}