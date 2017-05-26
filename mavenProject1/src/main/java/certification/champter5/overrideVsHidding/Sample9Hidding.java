package certification.champter5.overrideVsHidding;

/**
 * Created by konstantin on 15.05.2017.
 */
public class Sample9Hidding extends ParentClass2 {
    void method1(){
        System.out.println("child method1");
    }
    int a1 = 20;

}

class ParentClass2{
    private void method1(){
        System.out.println("parent method1");
    }
    int a1 = 10;

    public static void main(String[] args) {
        ParentClass2 s = new Sample9Hidding();
        s.method1();
        System.out.println(s.a1);
    }
}