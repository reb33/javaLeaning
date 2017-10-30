package certification2.champter7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import static java.util.stream.Collectors.*;

public class DeleteElsInConcColl {

    //При использовании конкуретных коллекций при удалении элемента при переборе ошибки нет
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>(Arrays.asList("aaa", "bbb", "ccc", "ddd"));
        for (String str : list){
            if (str.equals("bbb"))
                list.remove(str);
        }
        System.out.println(list);

        Map<Integer, String> map = list.stream().collect(toMap(
                (String str) -> str.chars().sum(),
                s->s,
                (s, s2) -> {throw new RuntimeException();},
                ConcurrentHashMap::new));
        System.out.println(map);

        for (Integer i: map.keySet()){
            if (i<295)
                map.remove(i);
        }
        System.out.println(map);

    }
}
