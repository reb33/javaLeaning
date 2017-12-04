package certification2.tricks;

import java.io.IOException;
import java.io.InterruptedIOException;

public class ExceptionSubOfThrowInMethod {

    void m2(){
        try {
            m1();
        } catch (InterruptedIOException e){

        }
         catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){}
    }

    void m1() throws Exception{}
}
