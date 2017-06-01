package certification.champter3;

/**
 * Created by konstantin on 05.04.2017.
 */
public class Sample1Wrapers {

    public static void main(String[] args) {
        Integer i = 3;
        Integer y = 4;
        Integer j = new Integer(4);
        Integer z = i+y;
        System.out.println(y.equals(j));
        System.out.println(z++);
        System.out.println(z);
        z += 10;
        System.out.println(z);

        System.out.println(++z instanceof Integer);
        m1(z++);
        System.out.println("после метода "+z);
        m1(z);
        System.out.println("после метода "+z);
        m2(z);
        System.out.println("после 2 метода "+z);
        m3(z);
        System.out.println("после 3 метода "+z);
        m4(z);
        System.out.println("после 4 метода "+z);

//        System.out.println(1 instanceof Integer);

//        System.out.println(new Long(null)); //нельзя NumberFormatException
//        System.out.println(new Integer(null)); //нельзя NumberFormatException
//        System.out.println(new String(null));
        System.out.println(new Boolean(null));


        Byte b = 1; // ссужает в byte, потом оборачивает
//        Byte b1 = new Byte(1); //не работает Byte от int

    }

    static void m1(Integer i){
        System.out.println("в методе "+i++);
    }
    static void m2(int i){
        i++;
    }
    static void m3(Integer i){
        i=30;
    }
    static void m4(Integer i){
        i+=5;
    }
}
