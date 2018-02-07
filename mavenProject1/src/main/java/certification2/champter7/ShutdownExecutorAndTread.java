package certification2.champter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownExecutorAndTread {

    public static void main(String[] args) {
        new Thread(()-> System.out.println("Its THREAD")).start();
        Executors.newSingleThreadExecutor().submit(()-> System.out.println("Its EXECUTOR"));
    }
}
