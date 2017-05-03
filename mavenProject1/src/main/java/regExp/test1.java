package regExp;

/**
 * Created by konstantin on 03.05.2017.
 */
public class test1 {

    public static void main(String[] args) {
        String str = "6.820,00";
        System.out.println(str.matches("[0-9,.]+"));
        System.out.println(str.matches("(\\d{1,3}\\.)*\\d{1,3},\\d\\d"));

    }
}
