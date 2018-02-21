package certification2.champter1.all_nested_classes;

public class InnersDeclaretions {

    class A{}

    static class B{}

    void m1(){
        new A();
        new B();
        new InnersDeclaretions.A();
        new InnersDeclaretions.B();
        new InnersDeclaretions().new A();
//        new InnersDeclaretions().new B();
    }

    static void m2(){
//        new A();
        new B();
//        new InnersDeclaretions.A();
        new InnersDeclaretions.B();
        new InnersDeclaretions().new A();
//        new InnersDeclaretions().new B();
    }
}
