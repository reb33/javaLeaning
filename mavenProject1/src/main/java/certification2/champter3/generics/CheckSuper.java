package certification2.champter3.generics;

import java.util.*;

/**
 * Created by konstantin on 12.09.2017.
 */
public class CheckSuper {

    <T extends Number> List<T> m1(T t){
        return new ArrayList<T>(Arrays.asList(t));
    }
    /*Нельзя в методе указывать lower bound(super)*/
//    <T super Number> List<T> m3(T t){
//        return new ArrayList<T>();
//    }

    void m2(){
        List<? super Number> list = new ArrayList<>();
        list.add(3);

     /*lower bound строго ограничивает на использование подклассов*/
//        List<? super Exception> list1 = new ArrayList<NullPointerException>();

//        List<List> lists = new ArrayList<ArrayList>();
    }

    class C1<T extends Number>{}

    /*Нельзя в классе указывать lower bound(super)*/
//    class C2<T super Number>{}
    /*Нельзя в классе указывать lower bound(super)*/
//    interface I1<T super Number>{}
}

    /*Нельзя в классе указывать lower bound(super)*/
//    class C2<T super String>{}
    /*Нельзя в классе указывать lower bound(super)*/
//    interface I1<T super Number>{}
