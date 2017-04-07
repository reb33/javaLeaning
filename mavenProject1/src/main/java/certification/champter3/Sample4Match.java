package certification.champter3;

/**
 * Created by konstantin on 07.04.2017.
 */
public class Sample4Match {

    public static void main(String[] args) {
        String s1 = "KB1123";
        String s2 = "kb1123";
        String s3 = "vb1234";
        String pattern = "^(?i)(?!KB).*$";
        System.out.println(s1.matches(pattern));
        System.out.println(s2.matches(pattern));
        System.out.println(s3.matches(pattern));
    }
}
