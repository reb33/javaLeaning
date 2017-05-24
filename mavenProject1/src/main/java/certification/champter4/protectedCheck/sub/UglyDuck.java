package certification.champter4.protectedCheck.sub;

/**
 * Created by konstantin on 24.05.2017.
 */
public class UglyDuck extends Swan {

    void check7(){
        UglyDuck uglyDuck = new UglyDuck();
        uglyDuck.getNameBird();
    }
    void check8(){
        Swan swan = new Swan();
//        swan.getNameBird(); //доступен только текущий класс или наследники, родительские НЕТ!!!!
    }
}
