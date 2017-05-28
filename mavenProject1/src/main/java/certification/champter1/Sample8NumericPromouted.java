package certification.champter1;

/**
 * Created by konstantin on 24.05.2017.
 */
public class Sample8NumericPromouted {

    public static void main(String[] args) {
        long x = 2;
        int y = 3;
//        y=y+x; //должен быть long
        y+=x;  //ok потомучто унарная операция

        short s = 4;
//        s=s+1; //должен быть int
        s++;
//        s=s+1; // еще short
        s+=4;
    }
}
