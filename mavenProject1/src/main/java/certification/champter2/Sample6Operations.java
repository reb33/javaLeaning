package certification.champter2;

/**
 * Created by konstantin on 06.04.2017.
 */
public class Sample6Operations {

    public static void main(String[] args) {
        short s = 100;
        s++;
        s +=2;
        System.out.println(s);

        int i = 5;
        i = i++;
        System.out.println(i);

        i = ++i;
        System.out.println(i);

        int x = 4;
        long y = x *4 - x++;
        System.out.println(x+", "+y);

        x=4;
        y = x++*4 -x;
        System.out.println(y);
    }
}
