package certification2.champter4;

import java.util.function.Consumer;

/**
 * Created by konstantin on 13.09.2017.
 */
public class EffectiveFinal {
    void m1(){
        String str;
        str = "str";

        String str1= "";
        str1="";

        Consumer<Integer> consumer = i -> {
            str.toLowerCase();

            /*Даже если переменная 2 переопределяется те  же значением она не effective final*/
//            str1.toLowerCase();
        };
    }
}
