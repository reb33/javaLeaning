package certification.champter6;

/**
 * Created by Konstantin on 27.06.2017.
 */
public class Sample9Try {
    public static void main(String[] args) {
        try {

            m2();
        }catch (Exception e){
            System.out.println("0");
        }catch (Throwable t){
            System.out.println("1");
        }
        System.out.println(3);
    }
    void m1(){
        try{
            return;
        }catch (NullPointerException|IllegalArgumentException|AbstractMethodError e){}
        catch (Exception e){
            return;
        }
//        int i = 0;
    }

    static void m2() throws Throwable{
        throw new Exception();
    }
}
