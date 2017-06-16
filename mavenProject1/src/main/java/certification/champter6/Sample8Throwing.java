package certification.champter6;

/**
 * Created by Konstantin on 13.06.2017.
 */
public class Sample8Throwing {

    public static void main(String[] args) throws Throwable {
//        throw null;
//        throw new Object();
//        throw new Exception();
        new Sample8Throwing().m1();
    }

    void m1(){
        Exception e =null;
//        throw e;
        RuntimeException re = null;
        throw re;
    }
}
