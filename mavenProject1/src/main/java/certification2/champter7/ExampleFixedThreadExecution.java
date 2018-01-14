package certification2.champter7;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExampleFixedThreadExecution {

    //pool не ждет пока заполнится очередь - сразу запускает добавленные задачи
    public static void main(String[] args) {
        System.out.println("start");
        m1();
        System.out.println("end");
    }

    static void m1(){
        ExecutorService es =null;
        try{
            es= Executors.newFixedThreadPool(3);
            List<Callable<Integer>> callables = IntStream.range(0,5)
                    .mapToObj(i-> (Callable<Integer>)()-> {
                        System.out.println(i+" start ");
                        Thread.sleep(2000);
                        System.out.println(i+" end");
                        return i;})
                    .collect(Collectors.toList());
            for (Callable<Integer> task:callables){
               es.submit(task);
                System.out.println(" added ");
               Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (es!=null)es.shutdown();
        }
    }
}
