package certification.champter2;

/**
 * Created by konstantin on 04.04.2017.
 */
public class Sample3Switch {

    public static void main(String[] args) {
        String str1 = "qqq";
        final String str2 = "www";
        String str3 = "ccc";
        switch (str1){
            case "qqq":{
                System.out.println("qqq");
                break;
            }
            case str2:{
                System.out.println("www");
                break;
            }
//            case str3:{   должно быть final
//
//            }
        }

        int x=3;
        final int x1 = 3;
        final int x2 = 3;
        short s = 2;
        final short s1 = 2;
        final short s2 = 4;
        final short s3 = 5;
        switch (3){
            case 2:{}
//            case x:{} не final
            case  x1:{}
//            case x2:{}  дубликат
//            case s:{}   не final
//            case s1:    дубликат
            case s2:
            case s3:{
                System.out.println("5");
            }
        }
    }
}
