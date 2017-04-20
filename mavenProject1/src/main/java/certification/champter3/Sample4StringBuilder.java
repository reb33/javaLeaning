package certification.champter3;

/**
 * Created by konstantin on 10.04.2017.
 */
public class Sample4StringBuilder{

    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder("1234");
        StringBuilder sb2 = new StringBuilder("1234");
        System.out.println(sb1.equals(sb2)); //false

//        System.out.println(sb1=="");
        Integer integer = new Integer(2);
//        System.out.println(sb1==integer);
//        System.out.println(inte1ger == "");

        System.out.println(sb1.substring(0,4));
        System.out.println(sb1);
        sb1.append(sb2);
        System.out.println(sb1);
    }
}
