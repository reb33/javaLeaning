package certification.champter4.protectedCheck.sub;

import certification.champter4.protectedCheck.main.Bird;

/**
 * Created by konstantin on 24.05.2017.
 */
public class Swan extends Bird{

    public static void main(String[] args) {

    }

    void check1(){
        System.out.println(getNameBird());
        System.out.println(text);
    }

    void check2(){
        Swan swan = new Swan();
        System.out.println(swan.getNameBird());
        System.out.println(swan.text);
    }

    void check3(){
        Bird bird = new Bird();
//        System.out.println(bird.getNameBird()); //protected недоступен
//        System.out.println(bird.text);
    }

    void check4(){
        UglyDuck uglyDuck = new UglyDuck();
        System.out.println(uglyDuck.getNameBird());
        System.out.println(uglyDuck.text);
    }
}
