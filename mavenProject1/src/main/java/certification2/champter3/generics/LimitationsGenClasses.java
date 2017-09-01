package certification2.champter3.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by konstantin on 01.09.2017.
 */
public class LimitationsGenClasses<T> {
    /*Можно создавать объектные переменные*/
    T t2;
    /*Статические переменные создавать нельзя, generics привязаны к объекту*/
//    static T t3;


    /*Generics недоступны из статических классов*/
//    static void m1(T t){
//        T one = t;
//    }

    void m2(T t1) {
        /*Не может быть инстанцииорованы напрямую, потому что компилятор заменяет на new Object()*/
//        T t = new T();

        /*запрещено создавать массивы от generics */
//        T[] arrsT = {t1};

        /*Можно создавать листы от generics*/
        List<T> list = new ArrayList<>();

        System.out.println(t1 instanceof Object);
        System.out.println(t1 instanceof Integer);

        Object obj = new Object();
        /*Нельзя вызывать instansof с generic в правой части */
//        System.out.println(obj instanceof T);

//    }
    }
}
