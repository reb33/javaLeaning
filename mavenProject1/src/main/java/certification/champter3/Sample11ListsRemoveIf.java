package certification.champter3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by konstantin on 23.05.2017.
 */
public class Sample11ListsRemoveIf {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("bird");
        list.add("sparoW");

        list.removeIf(s -> s.startsWith("h")||s.toLowerCase().endsWith("w"));
        System.out.println(list);
    }
}
