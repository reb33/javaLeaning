package certification.champter2;

/**
 * Created by konstantin on 22.05.2017.
 */
public class sample9EqualRef {

    public static void main(String[] args) {
        Integer integer = new Integer(4);
        String string = "4";
//        if (integer==string){}  разные типы не сравниваются
        if (integer==4){} //автобоксинг работает

    }
}
