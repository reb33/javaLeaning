package certification2.champter3.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by konstantin on 07.09.2017.
 */
public class MapsCheckMethods {

    /*В Map в методах get, remove, containsKey, containsValue - те которые принимают Object
    * при указании несвязанного с key типа компиляция проходит, runtime ош нет*/
    public static void main(String... args){
        Map<Integer, String> maps = new HashMap<>();
        maps.put(1,"1");
        System.out.println(maps.get(""));
        System.out.println(maps.remove(""));
        System.out.println(maps.containsKey(""));
        System.out.println(maps.containsValue(1));
        System.out.println("Hi");
    }
}
