package certification.champter5.intefaces;

/**
 * Created by konstantin on 21.06.2017.
 */
public class Sample12InitiationInter {
    static String init(String s){
        System.out.println("init "+s);
        return s;
    }

    public static void main(String[] args) {
        System.out.println(Parent12.a);
//        Parent12.m1();
//        System.out.println(Sub12.c);
//        System.out.println(Class.f);
        Sub12 s = new Class();
        System.out.println(s.e);
        System.out.println(s.d);
        System.out.println(s.a);
    }
}

interface SParent12{
    String a = "SP_a";
    String b = Sample12InitiationInter.init("SP_b");
    static void m1(){
        System.out.println("SP_m1()");
    }
}
interface Parent12 extends SParent12{
    String c = Sample12InitiationInter.init("P_c");
    String d = Sample12InitiationInter.init("P_d");
}
interface Sub12 extends Parent12{
    String e = Sample12InitiationInter.init("Sub_e");
    String f = Sample12InitiationInter.init("Sub_f");
    String a="Sub_a";
}
class Class implements Sub12,SParent12{}
