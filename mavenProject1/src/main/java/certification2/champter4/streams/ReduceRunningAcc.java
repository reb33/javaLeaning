package certification2.champter4.streams;

import java.util.stream.Stream;

/**
 * Created by konstantin on 25.09.2017.
 */
public class ReduceRunningAcc {

    public static void main(String[] args) {
        int ret1 = Stream.of(1,2,3).reduce((a,b)->{
            System.out.println("acc run_1");
            return a+b;
        }).get();

        int ret2 = Stream.of(1).reduce((a,b)->{
            System.out.println("acc run_2");
            return a+b;
        }).get();

        Stream.of(ret1, ret2).forEach(System.out::println);
    }
}
