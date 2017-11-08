package certification2.champter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureCanselCheck {
    //Future cancel(true) вызывает прерывание задачи
    //cancel(false) - только отменяет еще не запущенные задачи
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es=null;
        try{
            es = Executors.newSingleThreadExecutor();
            Future fut = es.submit(()->{
                System.out.println("begin");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("end");
                return;
            });
            Thread.sleep(1000);
            fut.cancel(true);
        }finally {
            if (es!=null) es.shutdown();
        }
    }
}
