package certification.champter3;

/**
 * Created by konstantin on 10.04.2017.
 */
public class Sample4StringBuilder{

    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder("1234");
        StringBuilder sb2 = new StringBuilder("1234");
        System.out.println(sb1.equals(sb2)); //false

//        System.out.println(sb1=="");
        Integer integer = new Integer(2);
//        System.out.println(sb1==integer);
//        System.out.println(inte1ger == "");

        System.out.println(sb1.substring(0,4));
        System.out.println(sb1);
        sb1.append(sb2);
        System.out.println(sb1);


        StringBuilder str = new StringBuilder("Java");
        System.out.println(str.append("vaJ$").substring(0,4));
        System.out.println(str.append("vaJ$").substring(3,7));

        StringBuilder sb3 = new StringBuilder("0123456789");
        System.out.println(sb3);
        sb3.setLength(5);
        System.out.println(sb3);
        sb3.setLength(10);
        System.out.println(sb3);

        System.out.println(m1());
        System.out.println("\nm2:");
        m2();

    }
    static String m1(){
        return new StringBuilder("qwer")+"tyui";
    }
    static void m2(){
        StringBuilder sb = new StringBuilder("0123456789");
        sb.delete(2,16);
        System.out.println(sb);
        
    }
}
