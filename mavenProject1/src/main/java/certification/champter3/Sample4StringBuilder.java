package certification.champter3;

/**
 * Created by konstantin on 10.04.2017.
 */
public class Sample4StringBuilder{

    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder("1234");
        StringBuilder sb2 = new StringBuilder("1234");
        System.out.println(sb1.equals(sb2)); //false
    }
}
