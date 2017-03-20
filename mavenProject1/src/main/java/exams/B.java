package exams;

/**
 * Created by konstantin on 01.03.2017.
 */
public class B {

    static B b = new B();

    public int show(){

//        return (true ? null : 0);
        return(123);

    }

    public static void main(String[] args)  {

//        B b = new B();

        System.out.println(b.show());

    }

}
