package certification2.tricks;

public class OrderOfInitialization {

    public static void main(String[] args) {
        OrderOfInitialization o = new OrderOfInitialization();
    }

    public OrderOfInitialization() {
        System.out.println(str);
        System.out.println(5);

    }

    static {
        System.out.println(1);
    }


    final String str = m1();

    String m1(){
        System.out.println(3);
        System.out.println(str);
        return "4";
    }

    static String str2= m2();

    static String m2(){
        System.out.println(2);
        return "";
    }
}
