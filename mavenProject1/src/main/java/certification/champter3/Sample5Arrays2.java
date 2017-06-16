package certification.champter3;

/**
 * Created by konstantin on 15.06.2017.
 */
public class Sample5Arrays2 {

    public static void main(String[] args) {
        m2();


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

}
