package certification2.champter1.all_nested_classes.inners;

/**
 * Created by konstantin on 17.08.2017.
 */
public class Accessing {
    class Inner{}

    //Доступ может быть как через имя outer класса так и без него
    void m1(){
        Inner inner = new Inner();
        Accessing.Inner inner1 = new Inner();
    }

    //Доступ к inner классу в static методе осуществляется только через объект outer класса
    //название класса доступно без имени outer класса
    //Доступ может быть как через имя outer класса так и без него
    static void m2(){
        Inner inner = new Accessing().new Inner();
        Accessing.Inner inner1 = new Accessing().new Inner();
    }
}

class Class2{

    //вне outer класса доступ к inner классу только через имя outer класса
    void m1(){
//        Inner inner = new Accessing().new Inner();
        Accessing.Inner inner1 = new Accessing().new Inner();
    }
}
