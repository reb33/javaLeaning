package certification.champter3;

/**
 * Created by konstantin on 15.06.2017.
 */
public class Sample5Arrays2 {

    public static void main(String[] args) {
        m1();


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

    }

}
