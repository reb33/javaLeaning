package certification2.champter6;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by konstantin on 16.10.2017.
 */
public class CloseableInstead {



    public static void main(String[] args) {
        try(A a = new A()){
            System.out.println("its try");
        }

    }
}

class A implements Closeable{
    @Override
    public void close() {
        System.out.println("its close method");
    }

}
