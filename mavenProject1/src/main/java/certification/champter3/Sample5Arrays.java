package certification.champter3;

/**
 * Created by konstantin on 10.04.2017.
 */
public class Sample5Arrays {

    public static void main(String[] args) {
//        int[] a1 = new int[]; нужно и нициировать или указать scope
        int[] a2 = new int[]{1,2,3};//избыточность, но не показывается
        int[] a3 = {1,2,3}; //только в одной строке с объявлением
        int[] a4;
//        a4 = {2,3,4}; не допускается

        a4 = new int[]{3,4,5};

        int a5 [] = {3,4,5};

        int [] a6 = {4,5,6}, a7={3,4,5};

        int a8[]={5,67,7}, i1 = 80; //a8 массив, i1 интегер
        System.out.println(a8.length);
        System.out.println(i1);
    }
}
