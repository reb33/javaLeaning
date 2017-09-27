package certification2.champter4.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by konstantin on 27.09.2017.
 */
public class CheckJoining {

    public static void main(String[] args) {
        System.out.println(Stream.iterate(1, x -> ++x)
                .limit(5)
                .map(x -> new StringBuilder(String.valueOf(x)))
                .collect(Collectors.joining("")));
    }
}
