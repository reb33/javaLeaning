package certification2.champter6;

import java.io.IOException;

public class ExceptionInClose {

    void m1(){
        try(A1 a=new A1()){
            System.out.println(a.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExceptionInClose exceptionInClose = new ExceptionInClose();
        exceptionInClose.m1();
    }
}

class A1 implements AutoCloseable{
    @Override
    public void close() throws IOException {
    }
}
