package certification2.champter1.all_nested_classes;

public class InnersDeclaretions {

    class A{}

    static class B{}

    B b = new B();
//    B b1 = this.new B();
    A a = new A() ;
    A a1 = this.new A();

    void m1(){
        new A();
        new B();
        new InnersDeclaretions.A();
        new InnersDeclaretions.B();
        new InnersDeclaretions().new A();
//        new InnersDeclaretions().new B();
    }

    static void m2(){
//        class C extends A{}
//        new A();
        new B();
//        new InnersDeclaretions.A();
        new InnersDeclaretions.B();
        new InnersDeclaretions().new A();
//        new InnersDeclaretions().new B();
    }
}
