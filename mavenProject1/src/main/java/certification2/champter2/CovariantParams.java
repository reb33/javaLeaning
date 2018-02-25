package certification2.champter2;

public class CovariantParams {

    class A{}
    class B extends A{}
    class C extends B{}

    interface D1{
        void m(A b);
    }

    void test1(D1 d, B b){
        d.m(b);
        d.m(new A());
        d.m(new B());
        d.m(new C());
    }

    void run(){
        test1(d->{}, new C());
    }
}
