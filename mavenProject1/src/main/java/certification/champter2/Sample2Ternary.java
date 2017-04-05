package certification.champter2;

/**
 * Created by konstantin on 04.04.2017.
 */
public class Sample2Ternary {

    public static void main(String[] args) {
        int x=1;
        short y=1;
        int z=0;
        int c = z = y<10?y++:x++;
        System.out.println(x+", "+y+", "+z+", "+c);
    }
}
