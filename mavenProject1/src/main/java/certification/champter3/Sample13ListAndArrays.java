package certification.champter3;

import java.util.Arrays;
import java.util.List;

/**
 * Created by konstantin on 23.05.2017.
 */
public class Sample13ListAndArrays {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5);
        Integer[] arr1 = list.toArray(new Integer[27]);
        System.out.println();

//        int[] arr2 = list.toArray();
    }
}
