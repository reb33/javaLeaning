package certification2.champter3.collections;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.stream.IntStream;

/**
 * Created by konstantin on 13.09.2017.
 */
public class CheckQueue {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.push("hello");
        deque.push("hi");
        deque.push("oli");
        IntStream.range(0,3).forEach(i -> System.out.println(deque.peek()));
//        for (int i=0;i<3;i++)
//            System.out.println(deque.peek());
    }
}
