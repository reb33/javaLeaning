package certification2.champter1.all_nested_classes.inners;

/**
 * Created by konstantin on 18.08.2017.
 */
public class OverrideMethods {
    void m1(){}

    class Inner extends OverrideMethods{
        /*inner класс не может включать в себя static*/
//        static void m1(){}
//        static int i;
    }
}
