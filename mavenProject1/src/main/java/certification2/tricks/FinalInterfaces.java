package certification2.tricks;

//интерфейсы абстрактны и не могут быть финал
public /*final*/ interface FinalInterfaces {

    void m1();

    default /*final*/ void m2(){};
    static /*final*/ void m3(){}



}
