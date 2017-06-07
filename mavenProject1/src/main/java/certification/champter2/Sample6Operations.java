package certification.champter2;

/**
 * Created by konstantin on 06.04.2017.
 */
public class Sample6Operations {

    public static void main(String[] args) {
        short s = 100;
        s++;
        s +=2;
        System.out.println(s);

        //3
        int i = 5;
        i = i++;
        System.out.println(i);

        //4
        i = ++i;
        System.out.println(i);

        //5
        int x = 4;
        long y = x *4 - x++;
        System.out.println(x+", "+y);

        //6
        x=4;
        y = x++*4 -x;
        System.out.println(y);

        //7
        int n=5;
        n = n+ ++n;
        System.out.println(n);

        //8
        n=5;
        n = ++n + n;
        System.out.println(n);

        //9
        n=5;
        i=5;
        n = n++ + ++n + n;
        System.out.println(n+" "+i);

        //10
        System.out.println(true & false | true & false);
//        System.out.println(false | true & false | false);

        boolean b1 = false;
        boolean b2 = false;

//        b1 != b2 = !b1; != имеет больший приоритет чем присваивание
        //11
        n=10;
        n += n=5;
        System.out.println(n);

        //12
        i=5;
        System.out.println(~i);
        //13
        System.out.println(3&i);
//        System.out.println(~b1);

        //14
        i = Integer.MIN_VALUE;
        n=-i;
        System.out.println(n+"   "+i);

    }
}
