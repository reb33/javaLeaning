package certification2.champter7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class BarrierWithShutdowns {

    static void await(CyclicBarrier cb,int i ){
//        if (true)
//        throw new RuntimeException("123");
        try {
            cb.await();
        } catch (InterruptedException e) {
            System.out.println("interrupted "+i);
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            System.out.println("broken "+i);
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);
        CyclicBarrier cb = new CyclicBarrier(5);
        List<Future> l = new ArrayList<>();

        IntStream.range(0,4).forEach(i-> {
            l.add(es.submit(()-> await(cb, i)));
        });
        es.shutdownNow();
        l.forEach(f-> {
            try {
                f.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
    }
}
