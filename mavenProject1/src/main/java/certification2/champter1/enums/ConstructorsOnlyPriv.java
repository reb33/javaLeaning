package certification2.champter1.enums;

/**
 * Created by konstantin on 15.08.2017.
 */
public class ConstructorsOnlyPriv {
}

enum E1{
    A,B,C;
    String opt;
    //разрешено подставить к конструктору только private.
    //при public и protected - ошибка компиляции
    E1(){
        opt="a";
    }
}
