package certification.champter4;

/**
 * Created by konstantin on 24.04.2017.
 */

//import java.util.Arrays;

import static java.util.Arrays.*; //можно импортить через *

public class Samples2StaticImports {

    public static void main(String[] args) {
        asList("one");
//        Arrays.asList("two"); не компилится т.к. нет импорта класса Arrays
    }

}
