package certification2.champter7;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExampleSync {

    public static void main(String[] args) {
        ExecutorService pool = null;
        ExampleSync es = new ExampleSync();

        try{
            pool = Executors.newFixedThreadPool(4);
            for (int i=0;i<4;i++)
                pool.submit(es::m1);
        }finally {
            if (pool != null) pool.shutdown();
        }
    }

    void m1(){
        Object str="";
        synchronized (str) {
            System.out.println("1");


            System.out.println("2");

            System.out.println("3");
        }
    }
}
