package certification.champter6;

import java.io.IOException;
import java.util.zip.DataFormatException;

/**
 * Created by konstantin on 16.05.2017.
 */
public class Sample5ImplementingInter implements OneInter5, TwoInter5 {

    @Override
    public void method1() /*throws Exception*/ { //добавляемое исключение должно соответствовать 2 методам

    }
}

interface OneInter5{
    void method1() throws Exception;
}

interface TwoInter5{
    void method1() throws DataFormatException;
}
