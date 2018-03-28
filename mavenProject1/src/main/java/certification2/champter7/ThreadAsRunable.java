package certification2.champter7;

public class ThreadAsRunable {

    public static void main(String[] args) {
        Thread a = new Thread(){
            @Override
            public void run() {
                System.out.println("Thread as Runnable");
            }
        };

        Thread t = new Thread(a);
        t.start();
    }
}
