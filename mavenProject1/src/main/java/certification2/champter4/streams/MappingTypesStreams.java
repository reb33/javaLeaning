package certification2.champter4.streams;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by konstantin on 26.09.2017.
 */
public class MappingTypesStreams {

    void m1(){
        Stream.of(1,2).mapToInt(Integer::intValue);
        Stream.of(1,2).mapToLong(Integer::intValue);
        Stream.of(1,2).mapToDouble(Integer::intValue);
}
}
