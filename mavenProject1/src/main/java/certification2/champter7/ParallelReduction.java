package certification2.champter7;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelReduction {

    //reduce в параллельном стриме собирает по порядку
    public static void main(String[] args) {
        String str = Stream.of('d','i','s','s','o','n','a','n','c','e')
                .parallel()
                .reduce("",(c,s)->s+c,(s1,s2)->s1+s2);
        System.out.println(str);
    }
}
