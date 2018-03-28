package certification2.champter7;

public class StaticLock implements Runnable{


    Object obj = new Object();
    int x, y;
    public void run()
    {
        synchronized(obj)
        {
            for(;;)
            {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                x++; y++; System.out.println(Thread.currentThread().getName()+"\t"+x+" "+y);
            }
        }
    }
    public static void main(String[] args)
    {
//        new StaticLock().start();
//        new StaticLock().start();
//        StaticLock sl = new StaticLock();
        new Thread(new StaticLock()).start();
        new Thread(new StaticLock()).start();
    }


}
