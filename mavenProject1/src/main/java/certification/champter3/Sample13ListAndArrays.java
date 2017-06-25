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
        System.out.println(Arrays.toString(arr1));

        Integer[] arr2 = new Integer[4];
        arr2[0]=1;
        Integer[] arr3 = list.toArray(arr2);
        System.out.println(arr2.clone()==arr3);
        System.out.println(Arrays.equals(arr2.clone(),arr3));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


        arr2 = new Integer[1];
        arr2[0]=1;
        arr3 = list.toArray(arr2);
        System.out.println(arr2==arr3);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println(arr1==arr3);

//        int[] arr2 = list.toArray();
    }
}
