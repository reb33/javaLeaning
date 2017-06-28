package certification.champter6;

/**
 * Created by konstantin on 26.06.2017.
 */
public class Sample9Throwable {

    public static void main(String[] args) throws Throwable {
        try {
            m3();
        }
        catch (Throwable t){
            System.out.println("catch Throwble");
        }
//        catch (Exception e){}
    }

    static void m1() throws Throwable {
        throw new Throwable();
    }
    static void m2() throws Exception{
        throw new Exception();
    }
    static void m3(){
        throw new RuntimeException();
    }
}
