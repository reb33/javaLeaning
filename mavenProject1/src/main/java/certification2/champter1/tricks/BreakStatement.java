package certification2.champter1.tricks;

/**
 * Created by konstantin on 21.08.2017.
 */
public class BreakStatement {

    public static void main(String[] args) {
        int i=2;
        lable:{
            i++;
            if (i==3)
                break lable;

            i+=4;
        }
        System.out.println(i);
    }
}
