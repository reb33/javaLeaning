package certification.champter6;

/**
 * Created by konstantin on 15.05.2017.
 */
public class Sample1Errors {
    void method1(){
        throw new Error("haas");
    }

    public static void main(String[] args) {
        Sample1Errors s = new Sample1Errors();
        try {
            s.method1();
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }

    }
}
