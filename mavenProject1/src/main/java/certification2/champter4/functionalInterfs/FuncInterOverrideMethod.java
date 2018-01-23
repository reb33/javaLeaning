package certification2.champter4.functionalInterfs;

public class FuncInterOverrideMethod {

    public static void main(String[] args) {
        m1(()-> System.out.println("it's ok"));
    }

    static void m1(MyFuncInter inter){
        inter.m1();
    }

    //Функциональные интерфейсы могут оверайдить методы из Object
    @FunctionalInterface
    private interface MyFuncInter{
        void m1();

        boolean equals(Object o);
    }
}
