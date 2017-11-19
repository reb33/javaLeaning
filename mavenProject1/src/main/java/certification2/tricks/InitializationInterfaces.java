package certification2.tricks;

/**
 * Created by konstantin on 21.06.2017.
 */
public class InitializationInterfaces {
    static String init(String s){
        System.out.println("init "+s);
        return s;
    }

    public static void main(String[] args) {
        System.out.println("инициализации интерфейса проиходит только если вызывается инициализации через метод");
        System.out.println(Parent12.a);
        System.out.println("если происходит инициализация через метод инициализируются все поля по порядку");
        System.out.println(Sub12.f);

        System.out.println("при вызове пременных интерфейса происходит инициализация только того интерфейса кому они принадлежат," +
                "\nРодители интерфейса не вызываются. Дочерние интерфейсы которые реализует класс не вызываются" +
                "\nСтатический иницатор класса не вызывается");
        System.out.println(Class.c);
//        System.out.println(Class.f);
        //static методы вызываются только от класса которому они принадлежат
//        Parent12.m1();
        System.out.println("При вызове метода выполняется инициализация");
        SParent12.m1();

        Sub12 s = new Class();
        System.out.println(s.e);
        System.out.println(s.d);
        System.out.println(s.a);
    }
}

interface SParent12{
    String a = "SP_a";
    String b = InitializationInterfaces.init("SP_b");
    static void m1(){
        System.out.println("SP_m1()");
    }
}

interface Parent12 extends SParent12 {
    String c = InitializationInterfaces.init("P_c");
    String d = InitializationInterfaces.init("P_d");
}

interface Sub12 extends Parent12 {
    String e = InitializationInterfaces.init("Sub_e");
    String f = InitializationInterfaces.init("Sub_f");
//    String a="Sub_a";
}

class Class implements Sub12 {
    static {
        System.out.println("static initialization Class");
    }
}
