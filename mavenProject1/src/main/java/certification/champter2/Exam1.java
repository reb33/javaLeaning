package certification.champter2;

/**
 * Created by konstantin on 23.03.2017.
 */
public class Exam1 {

    public static void main(String[] args) {
        int luck =10;
//        System.out.println((luck>10?luck++:--luck));
        if ((luck>10?luck++:--luck)<10){
            System.out.println("Bear");
        }if (luck<10){
            System.out.println("Sharp");
        }
    }


}
