package certification2.champter7;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteIterate {

    //при переборе перебираются значения установленные до начала цикла
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(1,2,3,4,5));

        for (Integer i:
            list ) {
            System.out.print(i+" ");
            list.add(9);
        }
        System.out.println();
        System.out.println(list);
        System.out.println(list.size());


    }
}
