package certification2.champter4.streams;

import java.util.stream.Stream;

/**
 * Created by konstantin on 27.09.2017.
 */
public class PeekThatModifyData {

    public static void main(String[] args) {
        Stream<String> streamStr1 = Stream.of("1","2","3");
        Stream<String> streamStr2 = Stream.of("1","2","3");
        streamStr1.peek(s -> s+="4").forEach(System.out::print);
        System.out.println();
        streamStr2.map(s -> s+="4").forEach(System.out::print);

        System.out.println();
        /*peek может изменять модифицируемые объекты, хоть это неправильно*/
        Stream<StringBuilder> streamSB = Stream.of(new StringBuilder("1"), new StringBuilder("2"),
                new StringBuilder("3"));
        streamSB.peek(s -> s.append(4)).forEach(System.out::print);

    }
}
