package certification.champter4;

/**
 * Created by konstantin on 03.05.2017.
 */
public class Sample5Final {

    final int var1;
    static final int var2;
    static {
        var2=1;
    }

    public Sample5Final(int var1) {
        this.var1 = var1;
    }

    public static void main(String[] args) {
        Sample5Final s = new Sample5Final(1);
        System.out.println(s.var1);
    }
}
