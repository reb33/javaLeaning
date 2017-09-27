package certification2.champter4.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Created by konstantin on 26.09.2017.
 */
public class PrimitivesStreams {
    void m1(){
        IntStream.of(1,23).sum();
        DoubleStream.of(1,23).sum();
        LongStream.of(1,23).sum();
        IntStream.of(1,32).average();
    }
}
