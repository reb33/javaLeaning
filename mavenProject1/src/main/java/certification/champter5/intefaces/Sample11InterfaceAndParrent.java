package certification.champter5.intefaces;

import javax.sound.midi.Soundbank;

/**
 * Created by konstantin on 06.06.2017.
 */
public class Sample11InterfaceAndParrent {
    public static void main(String[] args) {
        Int11 s = new Sub11();
        s.m1();
    }
}

class Sub11 extends Parent11 implements Int11{
//    public void m1(){
//        System.out.println("m1 - Sub");
//        super.m1();
//    }

}
class Parent11{
    public void m1(){
        System.out.println("m1 - Parrent");
    }
}
interface Int11{
    void m1();
}

