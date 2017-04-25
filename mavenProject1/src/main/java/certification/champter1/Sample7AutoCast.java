package certification.champter1;

/**
 * Created by konstantin on 25.04.2017.
 */

import static java.lang.System.out;


public class Sample7AutoCast {

    void method(float f){
        out.println("float "+ f);
    }

//    void method(long l){
//        out.println(l);
//    }

    void method(double d){
        out.println(d);
    }

    public static void main(String[] args) {
        Sample7AutoCast s = new Sample7AutoCast();
        s.method(2147483648L);
    }
}
