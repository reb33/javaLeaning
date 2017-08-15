package certification2.champter1.enums;

/**
 * Created by konstantin on 15.08.2017.
 */
public class SpecificatorsMembers {
}

enum E3{
    A{
        @Override
        void m5() {

        }
    },
    B{
        @Override
        void m5() {

        }
    },
    C{
        @Override
        void m5() {

        }
    };
    private String opt1;
    String opt2;
    protected String opt3;
    public String opt4;

    //final в переменных допустим по правилам как в классах - иниициализация в строке или в конструкторе
    final String opt5;
    E3(){
        opt5="a";
    }

    //static final так же
    static final  String opt6;
    //static инициаторы разрешены
    static {
        opt6="A";
    }

    private void m1(){};
    void m2(){};
    protected void m3(){};
    public void m4(){};

    //abstract не допустим если в каждом перечислении он переопределяется
    abstract void  m5();

    //final в методах допустим
    final void m6(){};
}
