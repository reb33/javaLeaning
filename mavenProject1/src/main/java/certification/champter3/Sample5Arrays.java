package certification.champter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by konstantin on 10.04.2017.
 */
public class Sample5Arrays {
    int[] arr=new int[2];

    public static void main(String[] args) {
        Sample5Arrays a = new Sample5Arrays();
        int[] a1_1 = new int[3];
        System.out.println(a1_1[0]);
//        System.out.println(a1_1[3]); //ArrayIndexOutOfBoundsException
        String[] strs1 = new String[4];
        System.out.println(strs1[0]);

        int[] a1 = new int[0]; //нужно инициировать или указать scope
        int[] a2 = new int[]{1,0,3};//избыточность, но не показывается
        int[] a3 = {1,2,3}; //только в одной строке с объявлением
        int[] a4;
//        a4 = {2,3,4}; не допускается

        a4 = new int[]{3,4,5,};

        int a5 [] = {3,4,5};

        int [] a6 = {4,5,6}, a7={3,4,5};

        int a8[]={5,67,7}, i1 = 80; //a8 массив, i1 интегер
        System.out.println(a8.length);
        System.out.println(i1);

        String[] strs = {"werr","wer"};
        Object[] objs = strs;
        strs = (String[]) objs;
//        objs[0] = new StringBuilder();
        System.out.println(objs[0]);

        List<Integer> ints = Arrays.asList(10, 4, 2,-2);
        Collections.sort(ints);
        Integer[] aarr = ints.toArray(new Integer[0]);
        System.out.println(Arrays.toString(aarr));

        String[][][] x1 = new String[1][0][5];
        x1[0] = new String [1][5];
//        x1[0][0] = new String[1];
        x1[0][0][0] = "2";
        System.out.println();


        System.out.println(x1.getClass().isArray());
        m1();
        m2();
    }

    static void m1(){
        int[][][] aaa = new int[1][][];
        int [][] aa = new int[1][1];

        aaa[0] = aa;
        aa = aaa[0];
        System.out.println();
        System.out.println(aa[0].length);
    }

    static void m2(){
        String[] strings = new String[10];
        Object[] objects = new Object[10];
        boolean[] booleans = new boolean[10];
        int[] ints = new int[10];
        System.out.println(strings[0]+" "+objects[0]+" "+booleans[0]+" "+ints[0]);
    }
}
