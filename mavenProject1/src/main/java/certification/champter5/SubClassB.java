package certification.champter5;

/**
 * Created by konstantin on 21.03.2017.
 */
public class SubClassB extends ClassA {
    public SubClassB(int a) {
        System.out.println("Constructor SubClassB");
    }

    public static void main(String[] args){
        SubClassB b = new SubClassB(2);
    }
}
