package certification2.champter1.all_nested_classes.ananymous;

/**
 * Created by konstantin on 16.08.2017.
 */
public class SampleAnanymous {

    private interface I1{
        void m1();
    }

    public static void main(String[] args) {
        I1 i1 = new I1() {
            @Override
            public void m1() {
                System.out.println("in anonymous");
            }
        };

        System.out.println(i1.toString());
        System.out.println(i1 instanceof Object);
//        System.out.println(i1 instanceof String);
        i1.m1();
    }
}
