package certification2.tricks;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by konstantin on 05.09.2017.
 */
public class Lists {

    void m1(){
        List<Byte> bytes = new ArrayList<>();

        /*нельзя пытается добавить инт*/
//        bytes.add(1);

        List<Double> doubles = new ArrayList<>();
        doubles = new ArrayList<>();
        /*нельзя не получается расширить и перевести в объект одновремено*/
//        doubles.add(1);
    }
}
