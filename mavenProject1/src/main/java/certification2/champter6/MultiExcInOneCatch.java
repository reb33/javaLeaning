package certification2.champter6;

import org.apache.commons.lang3.SerializationException;

import java.io.FileNotFoundException;
import java.io.NotSerializableException;

/**
 * Created by konstantin on 09.10.2017.
 */
public class MultiExcInOneCatch {

    //если в catch несколько проверяемых исключений каждое из них должно быть брошено в try
    public static void main(String[] args) {
        try{
            m1();
        }catch (FileNotFoundException|NotSerializableException e){}

    }

    static void m1() throws FileNotFoundException, NotSerializableException{}
}
