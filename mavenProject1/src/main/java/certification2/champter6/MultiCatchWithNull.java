package certification2.champter6;

public class MultiCatchWithNull {

    static class A implements AutoCloseable{
        @Override
        public void close(){
            System.out.println("close");
        }
        static void print(){
            System.out.println("print");
        }
    }
    class B{}

    public static void main(String[] args) {
        //будет выполнен только метод print.
        //метод close не будет выполняться
        try(A a = null;
            //проверяются ссылки
//            B b = null
        ){
            a.print();
        }
    }
}
