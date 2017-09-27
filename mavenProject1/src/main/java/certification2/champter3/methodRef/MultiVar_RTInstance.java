package certification2.champter3.methodRef;

/**
 * Created by konstantin on 14.09.2017.
 */
public class MultiVar_RTInstance {

    void m1(I1 i1){}

    void m3(I2 i2){}

    void m2(){
        /*перед указанием ссылки на метод не надо перечислять параметры*/
//        m1((t1, i2, i3, i4) -> Test1::m1);

        /*ссылка на метод возможно и с несколькими параметрами
        * должен вызываться метод первого параметра, при этом первый параметр обозначается классом*/
        m1(Test1::m1);

        /*Название класса можно заменить на интерфейсы или скперклассы*/
        m1(Isub::m1);

        /*ссылка на метод runtime объект смотрит только на 1 элемент*/
//        m3(Test1::m1);

    }

    class Test1 implements Isub{
        public void m1(Integer i1, Integer i2, Integer i3){}
    }
    interface Isub{
        void m1(Integer i1, Integer i2, Integer i3);
    }

    interface I1{
        void m1(Test1 t1, Integer i2, Integer i3, Integer i4);
    }
    interface I2{
        void m1( Integer i2,Test1 t1, Integer i3, Integer i4);
    }
}
