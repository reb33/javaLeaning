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
        deque.offer("ege-gey");
        deque.push("bonjorna");

        int size = deque.size();
        for (int i=0;i<size;i++)
            System.out.println(deque.pop());
    }
}
