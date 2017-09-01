package certification2.champter3.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by konstantin on 01.09.2017.
 */
public class Warnings {

    public static void main(String[] args) {

    }

    void m1(){
        List<Unicorn> unicorns = new ArrayList<>();
        addUnicorn(unicorns);
        Unicorn unicorn = unicorns.get(0);
    }

    void addUnicorn(List list){
        list.add(new Dragon());
    }
}

class Unicorn{}
class Dragon{}

