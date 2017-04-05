package certification.champter1;

/**
 * Created by konstantin on 30.03.2017.
 */
public class Sample5_2 {
    static{
        System.out.println("static initializer "+Sample5_2.class.getCanonicalName());
    }

    public Sample5_2() {
        System.out.println("constructor "+Sample5_2.class.getSimpleName());
    }

    static void hi(){
        System.out.println(Sample5_2.class.getSimpleName()+" Hi");
    }
}
