package certification2.champter7;

import java.util.concurrent.*;

public class BlockingQueueExample {

    public static void main(String[] args) {
        m_deque();
        System.out.println();
        m_queue();
    }

    static  void m_queue(){
        try { BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
            blockingQueue.offer(39);
            blockingQueue.offer(3 , 4, TimeUnit.SECONDS);
            System.out.println(blockingQueue);
            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            // Handle interruption
        }
    }

    static void m_deque(){
        try {
            BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
            blockingDeque.offer(91);
            blockingDeque.offerFirst(5, 2, TimeUnit.MINUTES);
            blockingDeque.offerLast(47, 100, TimeUnit.MICROSECONDS);
            blockingDeque.offer(3, 4, TimeUnit.SECONDS);

            System.out.println(blockingDeque);

            System.out.println(blockingDeque.poll());
            System.out.println(blockingDeque.poll(950, TimeUnit.MILLISECONDS));
            System.out.println(blockingDeque.pollFirst(200, TimeUnit.NANOSECONDS));
            System.out.println(blockingDeque.pollLast(1, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            // Handle interruption
        }
    }
}
