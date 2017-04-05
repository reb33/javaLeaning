package certification.champter3;

/**
 * Created by konstantin on 05.04.2017.
 */
public class Samples2Outputs {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str);
        Samples2Outputs s = null;
        System.out.println(s);
//        s.method1(); - NullPointerException
//        int[] arr = null;
//        for (int i: arr){
//            System.out.println(i);
//        }
    }

    public void method1(){
        System.out.println(123);
    }
}
