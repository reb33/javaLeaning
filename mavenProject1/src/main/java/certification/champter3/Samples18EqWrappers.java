package certification.champter3;

/**
 * Created by konstantin on 26.06.2017.
 */
public class Samples18EqWrappers {

    public static void main(String[] args) {

        m1("1");
        m2("1");
        m3();
        m4();
        m5();
    }
    static void m1(String str){
        System.out.println("\nm1 Integer :");
        Integer i1 = 1;
        Integer i2 = Integer.parseInt(str);
        System.out.println(i1==i2);
        System.out.println(i1);
        Integer i3 = 127;
        i2+=126;
        System.out.println(i2==i3);
        System.out.println(i2);
        i2++;
        i3++;
        System.out.println(i2==i3);
        System.out.println(i2);
        i2-=256;
        i3-=256;
        System.out.println(i2==i3);
        System.out.println(i2);
        i2--;
        i3--;
        System.out.println(i2==i3);
        System.out.println(i2);
    }
    static void m2(String str){
        System.out.println("\nm2 Long :");
        Long l1 = 1L;
        Long l2 = Long.parseLong(str);
        System.out.println(l1==l2);
        System.out.println(l1);
        l1+=127;
        l2+=127;
        System.out.println(l1==l2);
        System.out.println(l1);
    }
    static void m3(){
        System.out.println("\nm3 Double :");
        Double d1 = 1D;
        Double d2 = 1D;
        System.out.println(d1==d2);
        System.out.println(d1);
    }
    static void m4(){
        System.out.println("\nm4 Float :");
        Float f1 = 1F;
        Float f2 = 1F;
        System.out.println(f1==f2);
        System.out.println(f1);
    }
    static void m5(){
        System.out.println("\nm5 Boolean :");
        Boolean b1 = false;
        Boolean b2 = false;
        System.out.println(b1==b2);
        System.out.println(b1);
    }
}
