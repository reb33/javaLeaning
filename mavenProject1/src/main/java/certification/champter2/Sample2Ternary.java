package certification.champter2;

/**
 * Created by konstantin on 04.04.2017.
 */
public class Sample2Ternary {

    public static void main(String[] args) {
        int x=1;
        short y=1;
        int z=0;
        int c = z = y<10?y++:x++;
        System.out.println(x+", "+y+", "+z+", "+c);

//        String m=true?"yes":false; - не скомпилируется, при присваивании слева и справа должны быть правильные типы
        System.out.println(false?20:true);
        Object obj = true?"2":new Integer(4);

        int x1 = 5;
        System.out.println(x1>2?x1<4?10:8:7);

        int i=10;
//        System.out.println(true? 1:out1());

        byte b =1;
        short s=1;
        s = true?b:s;
        b = true?b:1+1;
        b = true?1:128+2;
        Byte byt = 1;
        Integer integer = 3;
//        s=(short)integer
        String str = b>1?null:"str";
        double doub = b>1?1d:1l;

        Number n = b>1?new Integer(3):(Number) 3;
        n = b>1?new Integer(3):new Double(3d);
        str=true?null:null;
        System.out.println(false?b:128+2);
        System.out.println(true?byt:1+2);
        System.out.println((true?3:new Integer(3)));
        System.out.println(b>1?new Integer(3):new Double(3d));
        System.out.println(b>1?"s":new Double(3d));
        System.out.println(true?new A():new B());
//        System.out.println(null);
    }
    static void out1(){}
    static void  out2(){}
}
class A{}
class B{}
