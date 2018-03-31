package certification2.champter3.generics;

public class GenericsBounds {
    public static void main(String[] args) {
        C1<Sub1> c1 = new C1<>();
        C1 c2 = new C1();
        C1<? extends Sub1> c3 = new C1<Sub2>();
        C1<Sub2> c4 = new C1<>();
        C1<? extends Sub2> c5 = new C1<Sub2>();
        C1<? super Sub2> c6 = new C1<Sub1>();
        C1<? super Sub1> c7 = new C1<Sub1>();
        //объект должен подходить и объвлению класса и объявлению переменной
//        C1<? super Sub1> c8 = new C1<Par>();
    }
}
class C1 <T extends Sub1>{}
class Par{}
class Sub1 extends Par{}
class Sub2 extends Sub1{}