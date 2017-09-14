package certification2.champter3.methodRef;

/**
 * Created by konstantin on 14.09.2017.
 */
public class MultiVar_StaticMethod {

    static void m1(Integer i1, Integer i2, Integer i3){}

    void m2(I1 i1){};

    void m3(){
        /*Можно несколько переменных
        главное чтобы количество переменных в методе совпадало с количеством переменных в методе интерфейса*/
        m2(MultiVar_StaticMethod::m1);
    }

    interface I1{
        void m1(Integer i1, Integer i2, Integer i3);
    }
}
