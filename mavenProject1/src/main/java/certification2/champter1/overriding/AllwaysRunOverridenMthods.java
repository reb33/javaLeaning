package certification2.champter1.overriding;

/**
 * Created by konstantin on 03.08.2017.
 */

/*Класс проверяет что всегда запускаются переопределенные методы*/
public class AllwaysRunOverridenMthods {
    public static void main(String[] args) {
        Parent1 p = new Sub1();
    }
}

class Parent1{
    String name="Parent";
    void m1(){
        System.out.println("it's parent class");
    }

    public Parent1() {
        m1();
    }
}

class Sub1 extends Parent1{
    final String name;
    Sub1(){
        name="Sub";
    }
    void m1(){

        System.out.println("it's Sub class name='"+name+"'");
    }
}
