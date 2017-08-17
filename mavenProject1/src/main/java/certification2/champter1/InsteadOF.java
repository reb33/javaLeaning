package certification2.champter1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by konstantin on 17.08.2017.
 */



public class InsteadOF {

    public static void main(String[] args) {
        /*Если null слева от instradof то возвращается false*/
        System.out.println(null instanceof Object);

        /*Объекты интерфейсов не вызывают ошибку компиляции при сравнивании с несвязанными классами*/
        Runnable r = new Thread();
        System.out.println(r instanceof InsteadOF);
        List<String> list = new ArrayList<>();
        System.out.println(list instanceof InsteadOF);

        /*Объекты от класса вызывают ошибку компиляции при сравнивании с несвязанными классами*/
        Thread t = new Thread();
        //System.out.println(t instanceof InsteadOF);

        /*Объекты от классов не вызывают ошибку компиляции при сравнивании с несвязанными интерфейсами*/
        InsteadOF ins = new InsteadOF();
        System.out.println(ins instanceof Runnable);
    }
}
