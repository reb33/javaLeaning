package certification2.champter1.all_nested_classes.inners;

import java.util.stream.IntStream;

/**
 * Created by konstantin on 15.08.2017.
 */
public class SampleInner1 {
    private String greeting = "Hi";
    private static String greetS ="";

    private class Inner{
        private int repeat = 3;

        private void go(){
            //inner класс имеет доступ к private членам outer класса
            System.out.println(greetS);
            IntStream.range(0,repeat).forEach(i ->
                System.out.println(greeting)
            );
        }
    }

    void sayIt(){
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        SampleInner1 s = new SampleInner1();
        s.sayIt();

        System.out.println();
        //new после точки
        Inner inner = new SampleInner1().new Inner();
        //outer класс имеет доступ к private членам inner класса
        inner.go();

        System.out.println(inner.repeat);
    }
}
