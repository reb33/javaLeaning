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
        System.out.println("\nm1:");
        Integer i1 = 1;
        Integer i2 = Integer.parseInt(str);
        System.out.println(i1==i2);
        Integer i3 = 127;
        i2+=126;
        System.out.println(i2==i3);
        i2++;
        i3++;
        System.out.println(i2==i3);
        i2-=255;
        i3-=255;
        System.out.println(i2==i3);
    }
    static void m2(String str){
        System.out.println("\nm2:");
        Long l1 = 1L;
        Long l2 = Long.parseLong(str);
        System.out.println(l1==l2);
        l1+=127;
        l2+=127;
        System.out.println(l1==l2);
    }
    static void m3(){
        System.out.println("\nm3:");
        Double d1 = 1D;
        Double d2 = 1D;
        System.out.println(d1==d2);
    }
    static void m4(){
        System.out.println("\nm4:");
        Float f1 = 1F;
        Float f2 = 1F;
        System.out.println(f1==f2);
    }
    static void m5(){
        System.out.println("\nm5:");
        Boolean b1 = false;
        Boolean b2 = false;
        System.out.println(b1==b2);
    }
}
