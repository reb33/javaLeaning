package certification.champter6;

import java.io.FileNotFoundException;

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
        }catch (FileNotFoundException e){}
//        try{
//            method4();                         //нельзя проверять на checked исключения если они в коде try не бросаются
//        }catch (FileNotFoundException e){
//
//        }
        try{
            throw new FileNotFoundException();
        }catch (FileNotFoundException e){}
        try{
            method4();
        }catch (RuntimeException e){

        }
    }

    static void method3() throws FileNotFoundException{}
    void method4(){}
}
