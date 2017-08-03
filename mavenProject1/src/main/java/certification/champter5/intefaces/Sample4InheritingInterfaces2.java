package certification.champter5.intefaces;

/**
 * Created by konstantin on 26.06.2017.
 */
/*Если класс наследует от родительского и дочернего интерфейсов, то воспринимается только дочерний*/
public class Sample4InheritingInterfaces2 {
    public static void main(String[] args) {
        Class42 c= new Class42();
        c.m1();
    }
}

class Class42 implements Inter1_42, Inter2_42{}
interface Inter1_42{
    default void m1(){
        System.out.println("Inter1_42 m1");
    }
}
interface Inter2_42 extends Inter1_42{
    default void m1(){
        System.out.println("Inter2_42 m1");
    }

}

interface Inter3_42 extends Inter1_42,Inter2_42{}
