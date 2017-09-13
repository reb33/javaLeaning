package certification2.champter4;

import java.util.function.Consumer;

/**
 * Created by konstantin on 13.09.2017.
 */
public class AccessFromLambda {
    static String s1="";
    static String s2;
    String s3;
    String s4;

    void m1(String s5, String s6){
        String s7;
        s7="";
        String s8="";
        s8=s8;
        String s9="", s10="";

        s2="";
        s4="";
        s6="";

        /*в лямбда можно использовать статические переменные, даже если они изменяются
        * переменные объекта даже если они изменяются
        * только EFFECTIVELY FINAL параметры метода
        * только EFFECTIVELY FINAL локальные переменные*/
        Consumer<String> consumer = s -> {
            s1.toLowerCase();
            s2.toLowerCase();
            s3.toLowerCase();
            s4.toLowerCase();
            s5.toLowerCase();
//            s6.toLowerCase();
            s7.toLowerCase();
//            s8.toLowerCase();
//            s9.toLowerCase();
        };
        s9="";
    }
}
