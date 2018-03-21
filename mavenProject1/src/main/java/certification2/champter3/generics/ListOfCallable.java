package certification2.champter3.generics;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ListOfCallable {

    public static void main(String[] args) {
        Callable c = ()->4;
        Callable c1=()->"str";
        List<Callable<Integer>> l= Arrays.asList(c,c,c1);
        ExecutorService e=Executors.newSingleThreadExecutor();
        l.forEach(callable-> {
            try {
                System.out.println(e.submit(callable).get());
            } catch (InterruptedException | ExecutionException e1) {
                e1.printStackTrace();
            }
        });
        e.shutdown();
    }
}
