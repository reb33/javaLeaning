package certification.champter3;

/**
 * Created by konstantin on 23.05.2017.
 */
public class Sample14ChangeInMethod {

    public static void main(String[] args) {
        Sample14ChangeInMethod s = new Sample14ChangeInMethod();
        String str1 = "str1";
        StringBuilder str2 = new StringBuilder("str2");
        s.changeIt(str1, str2);
        System.out.println(str1);
        System.out.println(str2);
    }

    void changeIt(String str1, StringBuilder str2){
        str1 = str1.concat("!!!");
        System.out.println("in method "+str1);
        str2.append("!!!");
    }
}
