package certification.champter3;

/**
 * Created by konstantin on 05.04.2017.
 */
public class Sample1Wrapers {

    public static void main(String[] args) {
        Integer i = 3;
        Integer y = 4;
        Integer j = new Integer(4);
        Integer z = i+y;
        System.out.println(y.equals(j));
        System.out.println(z++);
        System.out.println(z);
        z += 10;
        System.out.println(z);

        System.out.println(++z instanceof Integer);
        m1(z++);
        System.out.println("после метода "+z);
        m1(z);
        System.out.println("после метода "+z);
        m2(z);
        System.out.println("после 2 метода "+z);
        m3(z);
        System.out.println("после 3 метода "+z);
        m4(z);
        System.out.println("после 4 метода "+z);
        m4(3);
//        m4((short)3);
        m5(2);
        m2(new Short("3"));
        m2(new Byte("2"));

//        System.out.println(1 instanceof Integer);

//        System.out.println(new Long(null)); //нельзя NumberFormatException
//        System.out.println(new Integer(null)); //нельзя NumberFormatException
//        new Integer("");  //нельзя NumberFormatException
//        System.out.println(new String(null));
        System.out.println(new Boolean(null));


        System.out.println();
        System.out.println("блок 3:");
        Byte b = 4; // ссужает в byte, потом оборачивает
//        Byte b1 = new Byte(1); //не работает Byte от int
        i=4;
//        i==b;
        Integer i3 = 2;
        Integer i4 = 2;
        i4++;
        //1
        System.out.println(b==4);
        //2
        System.out.println(i==(char)4);
        Integer i1 = i4;
        Integer i2 = 4;
        Integer i6 = new Integer(3);
        //3
        System.out.println(i1==--i2);
        //4
        i4--;
        System.out.println(i3+i4==++i2);
        //5
        System.out.println(i1==i6);
        //6
        System.out.println(i1.equals(b));
        //7
        System.out.println(i1.equals(b.byteValue()));
        //8
        System.out.println(i1==b.byteValue());

        i=(int)b.byteValue();
        int i5 = b.byteValue();
        new Long(3);




        wrapsEqualsPriv();

    }
    static void wrapsEqualsPriv(){
        System.out.println("\n wrapsEqualsPriv:");
        Byte b1=3;
        System.out.println("block4:");
        System.out.println(b1.equals(3));
        System.out.println(new Long(3).equals(3));
        System.out.println(new Integer(3).equals(3));
    }
    static void wrapsToPriv(){
        System.out.println("\n wrapsToPriv:");

        Integer i =1;
        Byte b1 = 3;
        Short s1 = 3;
        Character c1 = 3;
        int privInt = b1;
        privInt = s1;
        privInt = c1;
        Long l = 1L;
        byte privByte = b1;
//        privByte = c1;
//        privByte = i;
        short privShort = b1;
        privShort = s1;
//        privShort = c1;
//        privShort = i;
        char privChar = c1;
//        c1=null;
//        privChar = c1;
        new Double(111);
//        i = privShort
        double privDouble = c1;
        privDouble = i;

        final Integer i2 = 3;
        final int privInt1=3;
//        privChar=i2;
        privChar=privInt1;
        float privFloat = l;

        Float f=1f;
//        long privLong = f;
//        b1 = i2;

    }

    static void m1(Integer i){
        System.out.println("в методе "+i++);
    }
    static void m2(int i){
        i++;
    }
    static void m3(Integer i){
        i=30;
    }
    static void m4(Integer i){
        i+=5;
    }
    static void m5(Object o){}
}
