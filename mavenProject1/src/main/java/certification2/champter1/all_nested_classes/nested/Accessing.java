package certification2.champter1.all_nested_classes.nested;

/**
 * Created by konstantin on 18.08.2017.
 */
public class Accessing {

    static class Nested{
        private int i1;
        private static int i2;
        static int i3;
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.i1);
        System.out.println(Nested.i2);
    }
}

class Class1{
    void m1(){
        System.out.println(Accessing.Nested.i3);
    }
}
