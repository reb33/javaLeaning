package certification2.champter7;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.IntArrayData;
import org.apache.commons.lang3.mutable.MutableInt;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InvokeAllInvokeAnyCheck {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        m1();
    }

    //invokeAll(Collection<Callable>) - выполняет задачи последовательно, даже если используется Pool
    static void m1() throws InterruptedException {
        ExecutorService es = null;
        try {
            es = Executors.newFixedThreadPool(2);
            List<Callable<Integer>> list = new ArrayList<>();
            IntStream.range(0,10).forEach(i -> list.add(()->{
                System.out.println("В потоке "+i);
                Thread.sleep(1000);
                return i;
            }));
            List<Future<Integer>> futureList= es.invokeAll(list);
            IntStream.range(0,futureList.size()).forEach(i -> {
                try {
                    System.out.println("результат потока "+futureList.get(i).get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            });
        }finally {
            if (es !=null) es.shutdown();
        }
    }

    //invokeAny - выполнить одну задачу(не обязательно первую) и вернет результат
    static void m2() throws InterruptedException, ExecutionException {
        ExecutorService es = null;
        try {
            es = Executors.newSingleThreadExecutor();
            List<Callable<Integer>> list = new ArrayList<>();
            IntStream.range(0,10).forEach(i -> list.add(()->i));
            Integer res= es.invokeAny(list);
            System.out.println(res);
        }finally {
            if (es !=null) es.shutdown();
        }
    }
}
