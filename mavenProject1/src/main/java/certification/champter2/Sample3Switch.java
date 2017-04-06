package certification.champter2;

/**
 * Created by konstantin on 04.04.2017.
 */
public class Sample3Switch {

    public static void main(String[] args) {
        String str1 = "qqq";
        final String str2 = "www";
        switch (str1){
            case "qqq":{
                System.out.println("qqq");
                break;
            }
            case str2:{
                System.out.println("www");
                break;
            }
        }
    }
}
