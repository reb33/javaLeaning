package certification2.champter3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsCast {
    public static void main(String[] args) {
        List<Par> list1 = new ArrayList<>();
//        List<Sub1> list2 = (List<Sub1>) list1;
        List<?> list3 = new ArrayList(Arrays.asList(new Sub2()));
        //List<?> нужно кастовать
        List<Sub1> list4 = (List<Sub1>) list3;
        List list5 = list3;
        List list6 = new ArrayList();
        //List без дженерика можно переводить к типизованному листу без каста
        List<Sub1> list7 = list6;
        List<?> list8 = list6;
        List<Integer> list9 = (List<Integer>) list3;
        List<Object> list10 = new ArrayList<>();
        //List<Object> нельзя перевести к типизованному листу даже с каст - ошибка компиляции
//        List<Sub1> list11 = list9;
    }
}
