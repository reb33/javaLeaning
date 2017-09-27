package certification2.tricks;

import java.util.function.Consumer;

/**
 * Created by konstantin on 14.09.2017.
 */
public class LambdaToString {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        System.out.println(consumer);
    }
}
