package certification.champter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by konstantin on 23.03.2017.
 */
public class Exam2Chickens {

    public static void main(String[] args) {
        HasList list = new MultiChicken();
        Chicken chicken = list.getChickens().get(0);
        for(int i=0;i<list.getChickens().size();){
            chicken = list.getChickens().get(i++);
                System.out.println("Chuck");

        }
    }

}

interface HasList{
    List<Chicken> getChickens();
}

class Chicken{}
class MultiChicken implements HasList{
    @Override
    public List<Chicken> getChickens() {
        return Arrays.asList(new Chicken(), new Chicken());
    }
}