package certification.champter3;

/**
 * Created by konstantin on 07.04.2017.
 */
public class Sample3Strings{
    public static void main(String... args){
        String s1 = "1";
        String s2 = s1.concat("2");
//        s2 = s2.concat(3);
        s2.concat("4");
        System.out.println(s2);


//        String str = "a"

        System.out.println("abc".concat("def"));

//        String str = 1+2;

        System.out.println("12 "+new StrA());
        System.out.println("StrA".equals(new StrA().toString()));

        String str = "012345678";
        System.out.println(str.substring(1,3));
        System.out.println(str.substring(1,9));
        System.out.println(str.substring(0, str.length()));

        String str1 = "one";
        String str2 = "two";
        System.out.println(str1.equals(str1=str2));
        System.out.println(str1);
        System.out.println(str1 == "tw"+"o");
        System.out.println(str1 == "two ".trim());
        String str3 = "o";
        System.out.println(str1 == "tw"+str3);
        str1.charAt(0);

//        System.out.println(new String((String)null));
        str = null;
        System.out.println(String.valueOf((Object) null));
        m2();
    }

    String m1(){
        return new StrA()+"";
    }

    static void m2(){
        String str = "XCv";
        System.out.println(str.replace('X', (char)11));
    }

}

class StrA{
    @Override
    public String toString() {
        return "StrA";
    }
}
