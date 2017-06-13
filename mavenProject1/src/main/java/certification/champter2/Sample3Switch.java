package certification.champter2;

/**
 * Created by konstantin on 04.04.2017.
 */
public class Sample3Switch {
    final static Integer X_INT_CONST = 12;
    final static Short S_SHORT_CONST = 13;

    public static void main(String[] args) {
        String str1 = "qqq";
        final String str2 = "www";
        String str3 = "ccc";
       label: switch (str1){
            case "qqq":
                System.out.println("qqq");
                break;

            case str2:
                System.out.println("www");
                break;

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
        final byte b1 = 6;
        final char c1 = 7;
        final Integer xInt = 8;
        final Short sShort = 9;
        final Byte bByte = 10;
        final Character cCharset =11;
        switch (new Short((short)3)){
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
            case b1:
            case c1:
//            case xInt:
//            case sShort:
//            case bByte:
//            case cCharset:
//            case X_INT_CONST:
//            case S_SHORT_CONST:
        }

        boolean isIt = true;
//        switch (isIt){
//
//        }

        final String fstr4 = str3;
//        switch (str1) {  //значение должно устанавливаться константой
//            case(fstr4):
//        }
        switch(1){
            case 2:
            case 3:
        }
    }
}
