package certification2.tricks;

/**
 * Created by konstantin on 17.08.2017.
 */
public class PrivateMethodAccess {

    public static void main(String[] args) {
        Class1 c1 = new Class1();
        Class1 c2 = new Class1();
//        c1.i;
//        c1.m1();
        System.out.println(c1.equals(c2));
    }
}

class Class1{
    private int i;

    boolean equals(Class1 c){
        return this.i == c.i;
    }

    private void m1(){}
}