package certification.champter2;

/**
 * Created by konstantin on 15.06.2017.
 */
public class Sample12Lables2 {
    public static void main(String[] args) {
        m2();
    }
    static void m1(){
        boolean bool = true;
        label1:{
            label2: System.out.println("test1 1");
            if (bool)
                break label1;
            System.out.println("test1 2");
        }
        System.out.println("test1 3");
    }

    static void m2(){
        label:{
            try{
                System.out.println("Try");
                throw new RuntimeException();
            }
            catch (RuntimeException e){
                System.out.println("Catch");
                break label;
            }
            finally {
                System.out.println("Finally");
            }
        }
    }
}
