package certification2.champter4.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by konstantin on 26.09.2017.
 */
public class IntermadiateDiffStrs {

    //m1 не работает - переменная stream не обновляется
    //m2 работает
    public static void main(String[] args) {
        m3();

    }

    static void m1(){
        IntStream stream = IntStream.rangeClosed(1,10);
        stream.filter(i -> i>3);
        stream.filter(i -> i<7);
        stream.peek(System.out::println);
        stream.count();
    }

    static void m2(){
        IntStream stream = IntStream.rangeClosed(1,10);
        stream = stream.filter(i -> i>3);
        stream = stream.filter(i -> i<7);
        stream = stream.peek(System.out::println);
        stream.count();
    }

    static void m3(){
        Stream<Integer> s = Stream.of(1);
        IntStream is = s.mapToInt(x->x);
        DoubleStream ds = s.mapToDouble(x->x);
        Stream<Integer> s2 = ds.mapToInt(x->(int)x).boxed();
    }


}
