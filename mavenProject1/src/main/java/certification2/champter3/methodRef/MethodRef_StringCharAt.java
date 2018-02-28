package certification2.champter3.methodRef;

public class MethodRef_StringCharAt {

    char m1(I1 i1, String str, int i){return i1.mI1(str, i);}

    char m2(){
        return m1(String::charAt, "Example", 3);
    }


    public static void main(String[] args) {
        MethodRef_StringCharAt methodRefStringCharAt = new MethodRef_StringCharAt();
        System.out.println(methodRefStringCharAt.m2());
    }

    interface I1{
        char mI1(String str, int i);
    }
}
