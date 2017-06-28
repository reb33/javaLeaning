package certification.champter3;

import java.util.Arrays;

/**
 * Created by konstantin on 15.06.2017.
 */
public class Sample5Arrays2 {

    public static void main(String[] args) {
        m2();
        m4();


    }
    static void m1(){
        int[] a1 = new int[3];
        Integer integer = null;
        int i = 3;
        try {
            a1[integer] = ++i;
        }catch (NullPointerException e){}
        System.out.println(i);
    }

    static void m2 (){
        int [][] a1 = {{11,12},{21,22}};
        int i = 99;
        try {
            a1[i = 1][new Integer(null)]++;
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(i);
    }

    static void m3(){
        int[] i,j[], z[][];
        i=new int[]{1};
        j=new int[2][3];
        z = new int[1][][];
        i=j[1];
        j=z[0];
    }
    static void m4(){
        int[] arr[] = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 1;
        arr[1][0] = 1;
        System.out.println(Arrays.toString(arr));
    }

}
