package certification.champter2;

/**
 * Created by konstantin on 05.04.2017.
 */
public class Sample4OverPrimitives {

    public static void main(String[] args) {
        int i = 2147483647;
        short s = (short)65537;
        byte b = (byte)i;
        i+=500;
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);
    }
}
