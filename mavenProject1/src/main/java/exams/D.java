package exams;

/**
 * Created by konstantin on 01.03.2017.
 */
public class D{

    D() {
        System.out.println("Constructor");

    }

    public static void show(){

        System.out.println("Вызван статический метод");

    }

    public void hi(){
        System.out.println("HI");
    }

    public static void main(String[] args)  {
        D obj = null;
        obj.show();

        D d = new D();
        d.hi();



    }

}