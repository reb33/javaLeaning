package certification2.tricks;

/**
 * Created by konstantin on 09.10.2017.
 */
public class Switches {

    public static void main(String[] args) {
        m3();
    }

    //default могут быть любыми по порядку
    static void m1(){
        switch (1) {
            default:
                System.out.println("def");
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
        }
    }

    //несовпадение типов с объектами
    static void m2(){
        final int i1 = 1;
        final byte b1 = 2;
        final short s1 = 3;
        final char c1 = 4;
        //при использовании Integer в switch в сфыу доступны только int
        switch (new Integer(3)){
            case i1:
                System.out.println("i1");
                //далее несовпадение типов
//            case b1:
//                System.out.println("b1");
//            case s1:
//                System.out.println("s1");
//            case c1:
//                System.out.println("c1");
        }
        //при использовании других оболочек в case доступны другие приметивы
        switch (new Byte((byte)1)){
            case i1:
                System.out.println("i1");
            case b1:
                System.out.println("b1");
            case s1:
                System.out.println("s1");
            case c1:
                System.out.println("c1");
        }

    }

    //в switch может не быть case'ов
    static void m3(){
        switch (1){

        }
    }
}
