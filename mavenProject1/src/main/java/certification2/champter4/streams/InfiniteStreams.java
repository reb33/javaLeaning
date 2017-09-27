package certification2.champter4.streams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by konstantin on 25.09.2017.
 */
public class InfiniteStreams {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.generate(()->(int)(Math.random()*100));
        Stream<Integer> stream2 = Stream.iterate(1, i->i+1);

        IntStream.generate(() -> (int)(Math.random()*100));
        System.out.println(IntStream.iterate(1, i -> i+2*i).boxed().collect(Collectors.toList()));
    }


}
