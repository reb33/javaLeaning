package certification2.champter7;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ShutdownNowOnCallables {

    public static void main(String[] args) throws InterruptedException {
       m1();
    }

    static void m1() throws InterruptedException {
        ExecutorService es = null;

        try{
            es = Executors.newSingleThreadExecutor();
            int i[] = {0};
            for (; i[0]<10;i[0]++){
                System.out.println(i[0]);
                es.submit(()-> {System.out.println("В потоке "+i[0]); Thread.sleep(5000);return "";});
            }
            System.out.println("Вне потока "+i[0]);

        }finally {
            Thread.sleep(2000);
            System.out.println("shutdown");
            if (es!=null) {
                List<Runnable> tasks = es.shutdownNow();
                IntStream.range(0,tasks.size()).forEach(i -> System.out.println(i+" "+tasks.get(i)));
            }
        }
    }
}
