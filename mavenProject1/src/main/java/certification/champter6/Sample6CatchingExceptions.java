package certification.champter6;

import java.io.IOException;

/**
 * Created by konstantin on 18.05.2017.
 */
public class Sample6CatchingExceptions {
    public static void main(String[] args) {
        try{
            throw new IllegalArgumentException();
        }catch (Exception e){
            System.out.println("cathing Exception");
        }
//        catch (RuntimeException e){    //RuntimeException нельзя объявлять после Exception так как это подкласс
//
//        }
    }
}
