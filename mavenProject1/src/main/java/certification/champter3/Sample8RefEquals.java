package certification.champter3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by konstantin on 18.04.2017.
 */
public class Sample8RefEquals {

    public static void main(String[] args) {
        Object o = new Object();
        Integer integer = new Integer(2);
        String s = new String();
        System.out.println(o==integer);
        System.out.println(s==o);
        System.out.println(o==s);
//        System.out.println(s==integer);

        List list = new ArrayList();
        ArrayList arrayList = new ArrayList();
        System.out.println(list==arrayList);
        LinkedList linkedList = new LinkedList();
        System.out.println(linkedList==list);
//        System.out.println(linkedList==arrayList);

        A a = new A();
        B b = new B();
        System.out.println(a==b);
    }


}
class A{}

class B extends A{}