package certification2.tricks;

/**
 * Created by konstantin on 05.09.2017.
 */
public class PrivEqualObjects {
    public static void main(String[] args) {
        /*если объекты приравниваются к равным приметивам от -128 до 127 то при == они равны,
         т.к. ипользуется одна и таже ссылка*/
        Integer integer1 = 5;
        Integer integer2 = 5;
        System.out.println(integer1 == integer2);

        /*они равны даже при выполнении вычислений*/
        integer1 +=10;
        integer2 += 15;
        integer2 -= 5;
        System.out.println(integer1 == integer2);

        /*если используется new то ссылки будут разными*/
        Integer integer3 = new Integer(15);
        System.out.println(integer1 == integer3);

        /*127 еще одна ссылка, 128 уже разные*/
        integer1 +=112;
        integer2 +=112;
        System.out.println(integer1==integer2);
        integer1+=1;
        integer2+=1;
        System.out.println(integer1==integer2);

        /*-128 еще одна ссылка, -129 уже разные*/
        integer1-=256;
        integer2-=256;
        System.out.println(integer1==integer2);
        integer1-=1;
        integer2-=1;
        System.out.println(integer1==integer2);

        /*Работает только на Byte, Short, Character*/
//        Double doubl = 1;
        Character character = 1;

        /*сравниваются как приметивы только Byte, Short Character и Integer,
        * остальные не сравниваются*/
        Double doubl1 = 1d;
        Double doubl2 = 1d;
        System.out.println(doubl1 == doubl2);
    }
}
