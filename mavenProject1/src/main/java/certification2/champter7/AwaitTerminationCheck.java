package certification2.champter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationCheck {

    //awaitTermination не прерывает выполнение, возвращает true если Executor успеет завершиться и false если не успевает
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = null;
        try{
            es = Executors.newSingleThreadExecutor();

            es.submit(()-> {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("it's over now");
                return;});
        }finally {
            if (es !=null) es.shutdown();
        }
        boolean isTermination = es.awaitTermination(3, TimeUnit.SECONDS);
        System.out.println(isTermination);

    }
}
