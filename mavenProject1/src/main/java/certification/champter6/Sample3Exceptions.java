package certification.champter6;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by konstantin on 16.05.2017.
 */
public class Sample3Exceptions {
    void method1() throws RuntimeException{
        System.out.println("hi");
    }

    void method2() throws FileNotFoundException{
        System.out.println("method2");
//        throw new FileNotFoundException();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Sample3Exceptions s = new Sample3Exceptions();
        s.method1();
        s.method2();
    }

    void boot(){
        try {
            method3();
        }
//        catch (FileNotFoundException e){}
        catch (IOException e){}
//        try{
//            method4();
//            throw new FileNotFoundException();
//        }catch (IOException e){  //нельзя проверять на checked исключения если они в коде try не бросаются
//
//        }/*catch (Exception e){}*/
        try{
            throw new FileNotFoundException();
        }catch (FileNotFoundException e){}
        catch (IOException e){}
        try{
            method4();
        }catch (RuntimeException e){

        }

        try{method5();}
        catch (Exception e){}
        finally {

        }
        try{
            method4();
        }catch (Exception e){}

    }

    static void method3() throws FileNotFoundException, IOException,FileNotFoundException,FileNotFoundException{}
    void method4(){}

    void method5() throws Exception{}
}
