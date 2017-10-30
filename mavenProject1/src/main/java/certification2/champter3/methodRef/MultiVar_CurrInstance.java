package certification2.champter3.methodRef;

public class MultiVar_CurrInstance {
    void m3(I1 i1){}

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        MyClass2 myClass2 = new MyClass2();

        MultiVar_CurrInstance mCI = new MultiVar_CurrInstance();

        //метод должен соответствовать методу интерфейса, он должен моч имплементировать метод
        mCI.m3(myClass::m1);
        //mCI.m3(myClass2::m1);
    }

    static class MyClass{

        Integer m1(String s1, String s2, String s3){return 0;}
    }
    static class MyClass2{

        String m1(String s1, String s2, String s3){return "";}
    }

    interface I1{
        Integer m2(String sq, String sq2, String sq3);
    }
}
