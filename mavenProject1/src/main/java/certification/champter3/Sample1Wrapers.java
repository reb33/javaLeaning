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
    }
}
