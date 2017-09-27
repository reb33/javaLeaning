package certification2.tricks;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by konstantin on 15.09.2017.
 */
public class MultiThrows {
    /*Можно указывать сразу несколько исключений*/
    void m1() throws NullPointerException,IOException, ClassCastException{}

    /*можно указывать sub и parent исключения, в любом порядке*/
    void m2() throws Exception, IOException, FileNotFoundException{}
    void m3() throws FileNotFoundException, IOException{}
}
