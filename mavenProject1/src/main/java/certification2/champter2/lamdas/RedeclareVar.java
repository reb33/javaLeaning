package certification2.champter2.lamdas;

/**
 * Created by konstantin on 21.08.2017.
 */
public class RedeclareVar {
    static void test(int x, int y, IntInt check){
        System.out.println(check.test(x,y));
    }

    public static void main(String[] args) {
        int x=0;
        /*параметр нельзя переопределять*/
//        test(1,2, (a,b)->{int a=2; return a>b;});

        /*локальные переменные должны быть final или effectively final как и в local inner классах*/
//        test(1,2, (a,b) -> {x=2; return a>b;});

        /*локальные переменные нельзя переопределять - они в scope*/
//        test(1,2, (a,b) -> {int x=2; return a>b;});

        /*в inner local можно переопределять локальные переменные, они не в scope*/
        test(1, 2, new IntInt() {
            @Override
            public boolean test(int a, int b) {
                int x=3;
                return false;
            }
        });
    }
}
