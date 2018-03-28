package certification2.champter7;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ListOfCallable {

    public static void main(String[] args) {
        Callable c = ()-> 3;
        List<Callable<Integer>> list = Arrays.asList(c,c,c);

        ExecutorService e=null;
        try{
            e= Executors.newFixedThreadPool(5);
            for (Future f:e.invokeAll(list)){
                System.out.println(f.get());
            }

        } catch (InterruptedException | ExecutionException e1) {
            e1.printStackTrace();
        } finally {
            if (e!=null) e.shutdown();
        }
    }
}
