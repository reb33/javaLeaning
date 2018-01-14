package certification2.champter7;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SincrouseExecutorsServicesInvoke {

    //invokeAll и invokeAny - запускаются синхроно - блокирую потом в котором они запущены
    //submit() - не блокирует поток вызова
    //invokeAny - запускает также все, но после того как 1 выполнилась - остальные cancel()
    public static void main(String[] args) {
        System.out.println("start");
       m2();
        System.out.println("end");
    }

    static void m1(){
        ExecutorService es =null;
        try{
            es= Executors.newSingleThreadExecutor();
            List<Callable<Integer>> callables = IntStream.range(0,3)
                    .mapToObj(i-> (Callable<Integer>)()-> {
                        System.out.println(i+" start ");
                        Thread.sleep(2000);
                        System.out.println(i+" end");
                        return i;})
                    .collect(Collectors.toList());
            es.invokeAll(callables);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (es!=null)es.shutdown();
        }
    }

    static void m2(){
        ExecutorService es =null;
        try{
            es= Executors.newSingleThreadExecutor();
            List<Callable<Integer>> callables = IntStream.range(0,3)
                    .mapToObj(i-> (Callable<Integer>)()-> {
                        System.out.println(i+" start ");
                        try {
                            Thread.sleep(2000);
                        }catch (InterruptedException e){
                            System.out.println(i+" was interrupted");
                            return i;
                        }
                        System.out.println(i+" end");
                        return i;})
                    .collect(Collectors.toList());
            System.out.println(es.invokeAny(callables));
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            if (es!=null)es.shutdown();
        }
    }

    static void m3(){
        ExecutorService es =null;
        try{
            es= Executors.newSingleThreadExecutor();
            List<Callable<Integer>> callables = IntStream.range(0,3)
                    .mapToObj(i-> (Callable<Integer>)()-> {
                        System.out.println(i+" start ");
                        Thread.sleep(2000);
                        System.out.println(i+" end");
                        return i;})
                    .collect(Collectors.toList());
            for (Callable<Integer> task:callables){
                es.submit(task);
            }
        } finally {
            if (es!=null)es.shutdown();
        }
    }
}
