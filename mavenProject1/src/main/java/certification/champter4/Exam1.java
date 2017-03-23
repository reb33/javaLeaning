package certification.champter4;

/**
 * Created by konstantin on 23.03.2017.
 */
public class Exam1 {
    public Exam1() {
        System.out.println("Exam");
    }

    public Exam1(int var){
        System.out.println("ExamVar");
    }

    private boolean hasSmth(){
        return false;
    }

    public static void main(String[] args) {
        Exam1 exam1 = new SubClass1(3);
        System.out.print(exam1.hasSmth());
    }
}

class SubClass1 extends Exam1{
    public SubClass1(int var) {
        System.out.println("SubClass");
    }

    public boolean hasSmth(){
        return true;
    }


}
