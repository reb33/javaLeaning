package certification.champter1;

/**
 * Created by konstantin on 29.03.2017.
 */
public class Sample3DeclareAndInitial {
    static String s1, s2, s3 = "third", s4="forth";
    String String = "String";

    public static void main(String[] args) {
        Sample3DeclareAndInitial s = new Sample3DeclareAndInitial();
        System.out.println(s1+ s2+ s3+ s4);
        System.out.println(s.String);

        int n = 0;
        String s2;
        boolean bool = true;
        if (true)
            s2="";

        System.out.println(s2);

//        byte b = 128; //128 за пределами byte
//        int i = 028; //неправильное число в восмеричной системе
//        int i = 0x1G  //неправильное число в 16 системе
//        byte by = 1+127; //128 за пределами byte
        byte by = 1+1;  //если сумма констант то может быть ссужена
//        byte byt = by+1; //если что-то не константа то ссужено не может быть
//        byte byt1 = 1L;  //long не ссужается
//        byte byt2 = 1f;  //float не ссужается
//        short sh1 = 32767+1;
//        char c = 65536;
        byte byt3 = 0b11;
//        byte byt4 = 0b12; //2 в двоичной системе
        by *= n;
        final int i=1;
        final int i1;
        i1=1;
        by=i;
//        by=i1;
        final byte by1 = 3;

        char ch = (char) by;
        by = (byte) ch;
        ch=by1;
//        n=1/0;
        n=2/3;

        double d = .1;
        float f = .1f;
        d = 01.1;
        System.out.println(f);
        f=1;
        System.out.println(f);
        f=0x1;
        System.out.println(f);
        f=Float.parseFloat("0b1");
        System.out.println(f);
    }

    final int perc=0;
    void m1(){
        int x,y,z;
        if (perc<10){
            x=y=z=1;
        }
        System.out.println(x+y+z);
    }
}
