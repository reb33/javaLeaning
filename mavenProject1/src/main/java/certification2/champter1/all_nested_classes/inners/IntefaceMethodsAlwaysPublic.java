package certification2.champter1.all_nested_classes.inners;

/**
 * Created by konstantin on 15.08.2017.
 */
public class IntefaceMethodsAlwaysPublic {

    protected interface I1{
        void m1();
    }

    class A implements I1{
        //не может быть переопределен не как public!
        @Override
        public void m1() {

        }
    }
}
