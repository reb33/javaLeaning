package certification.champter5;

/**
 * Created by konstantin on 24.03.2017.
 */
public class Exam2TwoInterfaces{
}

interface IntA{
    public default String getName(){
        return null;
    }
}

interface IntB{
    public default String getName(){
        return null;
    }
}

//abstract class ClassA2 implements IntA, IntB{
//
//
//}