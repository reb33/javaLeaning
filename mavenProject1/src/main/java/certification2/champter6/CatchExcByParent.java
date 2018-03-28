package certification2.champter6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchExcByParent {

    public static void main(String[] args) {
        try {
            throw new FileNotFoundException();
        }catch (IOException e){}
    }
}
