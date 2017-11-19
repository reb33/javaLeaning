package certification2.champter7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class BarrierInterruptAwaitingThread {


    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cb = new CyclicBarrier(4);
        List<ExecutorService> executorServiceList = new ArrayList<>();
        try{
            IntStream.range(0,3).forEach(i->executorServiceList.add(Executors.newSingleThreadExecutor()));

            for (int i=0;i<3;i++){
                Runnable currThread = new SampleThread(cb, i);
                executorServiceList.get(i).submit(currThread);
            }
            Thread.sleep(1000);
            executorServiceList.get(1).shutdownNow();
        }finally {
            executorServiceList.forEach(ExecutorService::shutdown);
        }
    }

    //если потоки ждут и один из них прервать то все остакльные выкинут BrokenBarrierException
    static class SampleThread implements Runnable{
        CyclicBarrier cb;
        int index;

        public SampleThread(CyclicBarrier cb, int index) {
            this.cb = cb;
            this.index = index;
        }

        @Override
        public void run() {
            System.out.println("it's start thread "+index);
            try {
                cb.await();
            } catch (InterruptedException e) {
                System.out.println("thread "+index+" was interrupted "+e.toString());
            } catch (BrokenBarrierException e){
                System.out.println("thread "+index+" was broken "+e.toString());
                return;
            }
            System.out.println("it's end thread "+index);
        }
    }
}
