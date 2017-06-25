package certification.champter5.inheriting;

/**
 * Created by konstantin on 21.06.2017.
 */
public class Sample11Static {
    public static void main(String[] args) {
        System.out.println(Sub11.str);
        System.out.println(Parent11.sub11==null);

        System.out.println(Sub11_2.m2());
        System.out.println(Sub11_2.str);

    }
    static String init(String s){
        System.out.println("init "+s);
        return s;
    }
}
class Parent11{
    static String str = "Parrent11";
//    static{
//        System.out.println("static initiator Parent11");
//    }
    static Sub11 sub11;
}
class Sub11 extends Parent11{

    static{
        System.out.println("static initiator Sub11");
    }

}
class Parent11_2 implements Inter11{
    static String m2(){
        return "Parent11_2";
    }
    static {
        System.out.println("static initiator Parent11_2");
    }
}
class Sub11_2 extends Parent11_2{
    static {
        System.out.println("static initiator Sub11_2");
    }
}

interface Inter11{
    String str = Sample11Static.init("str");
}
