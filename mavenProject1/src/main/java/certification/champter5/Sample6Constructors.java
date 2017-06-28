package certification.champter5;

/**
 * Created by konstantin on 03.05.2017.
 */
public class Sample6Constructors {
    int i;

    public static void main(String[] args) {
//        this(); - можно вызвать только внутри конструктора, первой строчкой
        Sample6Constructors s = new Sample6Constructors();
        System.out.println(s.hashCode());
        System.out.println(s.i);
    }

    public Sample6Constructors() {
        System.out.println(new Sample6Constructors(2).hashCode());
    }
    public Sample6Constructors(int i) {
        this.i = i;
    }
}
