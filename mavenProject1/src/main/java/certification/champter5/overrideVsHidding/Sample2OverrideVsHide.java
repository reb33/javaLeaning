package certification.champter5.overrideVsHidding;

/**
 * Created by Konstantin on 09.05.2017.
 */
public class Sample2OverrideVsHide extends ParentClass{
    int length=10;
    static String itIs(){
        return "childClass";
    }
    String itIs2(){
        return "childClass2";
    }
    void printChild(){
        System.out.println(String.format("It is CHILD print length='%s' staticItIs='%s' nonStaticItIs='%s'", String.valueOf(length), itIs(), itIs2()));
    }
    void print(){
        System.out.println(String.format("It is CHILD print length='%s' staticItIs='%s' nonStaticItIs='%s'", String.valueOf(length), itIs(), itIs2()));
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void main(String[] args) {
        Sample2OverrideVsHide s = new Sample2OverrideVsHide();
        s.printParent();
        s.printChild();

        System.out.println();
        ParentClass s2 = new Sample2OverrideVsHide();
        s2.printParent();

        System.out.println();
        ParentClass s3 = new ParentClass();
        s3.printParent();

        s2.length=500;
        System.out.println(s.length);
        System.out.println(s2.length);
        s2.setLength(100);
        System.out.println(s.length);
        System.out.println(s2.length);
        System.out.println(s.itIs());
        System.out.println(s2.itIs());

        s.print();
        s2.print();


    }
}

class ParentClass{
    int length=50;
    static String itIs(){
        return "parentClass";
    }
    String itIs2(){
        return "parentClass2";
    }
    void printParent(){
        System.out.println(String.format("It is PARENT print length='%s' staticItIs='%s' nonStaticItIs='%s'", String.valueOf(length), itIs(), itIs2()));
    }
    void print(){
        System.out.println(String.format("It is PARENT print length='%s' staticItIs='%s' nonStaticItIs='%s'", String.valueOf(length), itIs(), itIs2()));
    }
    public void setLength(int length) {
        this.length = length;
    }
}
