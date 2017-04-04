package certification.champter1;

/**
 * Created by konstantin on 29.03.2017.
 */
public class Exam3Constr {

    public Exam3Constr() {
        System.out.println("constructor");
    }

    public void Exam3Constr(){
        System.out.println("method");
    }

    public static void main(String[] args) {
        Exam3Constr exam3Constr = new Exam3Constr();
        exam3Constr.Exam3Constr();
    }
}
