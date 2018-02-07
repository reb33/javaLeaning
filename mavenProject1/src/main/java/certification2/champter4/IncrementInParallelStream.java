package certification2.champter4;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class IncrementInParallelStream {

    public static void main(String[] args) {
        AtomicInteger ai =new AtomicInteger(0);
        Stream.of("old", "cool", "leaf", "star", "lion", "core", "paper", "merry")
                .parallel()
                .filter(s -> {
                    System.out.println(Thread.currentThread().getName()+" check '"+s+"' increment to "+ai.incrementAndGet());

                    return s.contains("o");
                })
                .allMatch(s-> s.indexOf("o")>0);
        System.out.println(ai);
    }
}
