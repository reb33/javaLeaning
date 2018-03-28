package certification2.champter3;

import java.util.List;

public class AddAndGetElementsInCollections {

    void m1(List<B> list){
        list.add((B)new A());
        list.add(new B());
        list.add(new C());
    }

    void m2(List<? extends B> list){
//        list.add(new B());
//        list.add(new C());
//        list.add(new A());

        B b = list.get(0);
        A a = list.get(0);
        C c = (C) list.get(0);
    }

    void m3(List<? super B> list){
        list.add((B)new A());
        list.add(new B());
        list.add(new C());

//        A a = list.get(0);
//        B b = list.get(0);
        Object object = list.get(0);
    }

    void m4(List<?>  list){
//        list.add(new Object());
        Object obj = list.get(0);
    }
}

class A{}
class B extends A{}
class C extends B{}
