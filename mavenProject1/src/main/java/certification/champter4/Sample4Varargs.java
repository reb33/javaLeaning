package certification.champter4;

/**
 * Created by konstantin on 03.05.2017.
 */
public class Sample4Varargs {

    public void method1(String[] args1, int... args3){

    }

    public void method2(boolean b1, boolean... args3){

    }

    public static void main(String[] args) {
        Sample4Varargs s = new Sample4Varargs();
        s.method2(true, true, true);
//        s.method2(true, {true, true}); в метод нельзяпередавать инициатор массива
        s.method2(true, new boolean[2]);
    }
}
