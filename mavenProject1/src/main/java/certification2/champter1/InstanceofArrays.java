package certification2.champter1;

public class InstanceofArrays {

    interface A{}
    class B implements A{}
    class C extends B{}

    public static void main(String[] args) {
        //бросает NegativeArraySizeException
//        C[] cs = new C[-1];
        C[] cs = new C[0];
        System.out.println(cs instanceof B[]);
        //объект массива instanceof interface - ош. компиляции
//        System.out.println(cs instanceof A);
        System.out.println(cs instanceof A[]);
    }
}
