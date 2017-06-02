package certification.champter2;

/**
 * Created by konstantin on 05.04.2017.
 */
public class Sample5ForEach {
    public static void main(String[] args) {
        int[] arr1 = {3,2,4};
        for (int i : arr1){
            System.out.println(i);
        }
//        int[] arr = null;
//        for (int i: arr){
//            System.out.println(i);
//        }
        String[] objs = {"aaa", "bbb", "ccc"};
        for (final String o: objs){
//            o = "";
            System.out.println(o);
        }
    }
}
