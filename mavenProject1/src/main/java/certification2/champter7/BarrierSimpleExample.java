package certification2.champter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class BarrierSimpleExample {

    CyclicBarrier cb = new CyclicBarrier(3);
    List<ExecutorService> executorServiceList = new ArrayList<>();

    void m1(){
        IntStream.range(0,3).forEach(i->executorServiceList.add(Executors.newSingleThreadExecutor()));

        try {
            for (int i = 0; i < 3; i++) {
                executorServiceList.get(i).submit(new SimpleThread(cb, i));
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            executorServiceList.forEach(ExecutorService::shutdown);
        }
    }

    public static void main(String[] args) {
        BarrierSimpleExample b = new BarrierSimpleExample();
        b.m1();
    }

    private static class SimpleThread implements Callable<String>{
        CyclicBarrier cb;
        int num;

        public SimpleThread(CyclicBarrier cb, int num) {
            this.cb = cb;
            this.num = num;
        }

        @Override
        public String call() {
            System.out.println(num+" start");
            try {
                System.out.println(num+" getNumberWaiting - "+cb.getNumberWaiting()+"");
                cb.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(num + " interrupted");
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
                System.out.println(num + "barrier broken");
            }
            System.out.println(num +" over");
            return "";

        }
    }
}
