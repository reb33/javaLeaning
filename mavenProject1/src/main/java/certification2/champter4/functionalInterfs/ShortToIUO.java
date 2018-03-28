package certification2.champter4.functionalInterfs;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class ShortToIUO {

    public static void main(String[] args) {
        IntUnaryOperator iuo1 = i->i;

        //в функциональные интерфейсы нельзя вставлять даже типы кастуемые в нужный
//        IntUnaryOperator iuo2 = (short s)-> s;
        short s = 0;
        IntUnaryOperator iou3= i-> s;
        //в функциональные интерфейсы нельзя вставлять даже ковариатные типы
//        UnaryOperator<Number> uo = (Integer i)->3;

    }
}
