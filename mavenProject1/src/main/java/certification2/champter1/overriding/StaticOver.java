package certification2.champter1.overriding;

public class StaticOver extends P implements I1{
    static void m1(){}
    void m2(){
//        I1.super.m1();
    }

}
interface I1{
    static void m1(){};
}
class P{
    static void m1(){}
}
