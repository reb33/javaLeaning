package certification2.champter1.enums;

/**
 * Created by konstantin on 15.08.2017.
 */


public class OverridingMethods {
    public static void main(String[] args) {
        E4.A.printInfo();
        System.out.println();
        E4.B.printInfo();
        System.out.println();
        E4.C.printInfo();
    }
}

enum E4{
    A{
        //методы можно переписывать для каждого значения
        @Override
        void printInfo(){
            System.out.println("this is E4.A");
        }
    },
    B{
        //можно обратиться к методу родителя через super
        @Override
        void printInfo() {
            super.printInfo();
            System.out.println("this is E4.B");
        }
    },
    C;
    void printInfo(){
        System.out.println("this is E4");
    }
}
