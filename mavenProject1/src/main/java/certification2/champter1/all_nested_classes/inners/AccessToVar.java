package certification2.champter1.all_nested_classes.inners;

/**
 * Created by konstantin on 15.08.2017.
 */
public class AccessToVar {
    private int x=10;
    class A{
        private int x=20;
        class B{
            private int x=30;
            void printAll(){
                System.out.println(x);
                System.out.println(this.x);
                System.out.println(AccessToVar.A.B.this.x);
                System.out.println(A.B.this.x);
                System.out.println(A.this.x);
                System.out.println(AccessToVar.A.this.x);
                System.out.println(AccessToVar.this.x);
            }
            class C{}
        }
    }

    public static void main(String[] args) {
        AccessToVar acc = new AccessToVar();
        A a =acc.new A();
        //к inner клаасу inner класса нужно обращаться через название первого inner класса
        A.B b =a.new B();
        b.printAll();
        A.B.C c = b.new C();
    }
}
