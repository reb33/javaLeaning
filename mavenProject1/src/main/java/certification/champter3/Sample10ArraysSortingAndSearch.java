package certification.champter3;

import java.util.Arrays;
import java.util.List;

/**
 * Created by konstantin on 23.05.2017.
 */
public class Sample10ArraysSortingAndSearch {

    public static void main(String[] args) {
        int[] arrInt1 = {3, 7, 4, 2};
        Arrays.sort(arrInt1 /*,(i1,i2)->i2-i1*/);
//        List<Integer> list = ;
        System.out.println(Arrays.asList(arrInt1));
        System.out.println(Arrays.toString(arrInt1));
        System.out.println(Arrays.binarySearch(arrInt1, 5));
    }
}
