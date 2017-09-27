package certification2.champter4.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by konstantin on 26.09.2017.
 */
public class IntermadiateDiffStrs {

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1,10);
        stream.filter(i -> i>3);
        stream.filter(i -> i<7);
        stream.peek(System.out::println);
        stream.count();

    }
}
