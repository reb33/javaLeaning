package certification2.tricks;

/**
 * Created by konstantin on 14.09.2017.
 */
public class InterfacesAlwaysPublicMembers {
    void m1(){
        /*Все переменные в интерфейсах static public final*/
        System.out.println(I1.i4);
//        I1.i4=2;
    }

    interface I1{
        /*переменные не могут быть protected, private
        * все переменные static public final, так что они должны быть инициированы в строке объявления
        * в интерфейсах запрещен static инициатор*/
//        protected int i1;
//        private int i2;
//        int i2;
//        static {i2=3;}
        int i4=1;
    }
}
