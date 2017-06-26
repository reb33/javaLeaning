package certification.champter5;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Konstantin on 26.06.2017.
 */
public class Sample6Constructors2 {

}
class Parent62{
    Parent62() throws CloneNotSupportedException, IOException{}
    Parent62(int i){}
}
class Sub62 extends Parent62{
    public Sub62() {
       super(2);
    }
    Sub62(int i)throws Exception{

    }
}