package certification2.champter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SynchOnModObj {

     static Integer integer= 0;

     static void m1(){
         synchronized (integer){
             integer++;
         }
     }

     static void m2(){
         synchronized (integer){
             integer--;
         }
     }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService es=null;
        try{
            es= Executors.newFixedThreadPool(50);
            for(int i=0;i<30;i++){
                es.submit(SynchOnModObj::m1);
            }
            for (int i=0;i<20;i++)
                es.submit(SynchOnModObj::m2);
        }finally {
            if (es!=null){es.shutdown();
            es.awaitTermination(10, TimeUnit.SECONDS);}
        }
        System.out.println(integer);
    }
}
