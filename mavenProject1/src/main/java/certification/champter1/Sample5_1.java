package certification.champter1;

/**
 * Created by konstantin on 30.03.2017.
 */
public class Sample5_1 extends Sample5_2{
    static{
        System.out.println("static initializer "+Sample5_1.class.getSimpleName());
    }

    public Sample5_1() {
        System.out.println("constructor "+Sample5_1.class.getSimpleName());
    }

    public static void main(String[] args) {
        System.out.println("psvm "+ Sample5_1.class.getCanonicalName());
        System.out.println(Sample5_2.class.getCanonicalName());
        Sample5_2.hi();
        Sample5_1 s= new Sample5_1();
    }
}
