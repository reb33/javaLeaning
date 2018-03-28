package certification2.tricks;

public class EqualWithNull {

    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj==null);
        System.out.println(obj.equals(null));
    }
}
