package com.insightfullogic.java8.myExemples.samples;

import java.util.*;
import java.util.stream.Collector;


import static java.util.stream.Collectors.*;




/**
 * Created by konstantin on 11.07.2017.
 */
public class StringToMap {

    //Даны 2 строки проверить на равность элементов
    public static Map<String,Integer> strToMap(String str){
        return str.chars().parallel()
                .collect(HashMap::new,
                        (map,i)->{
                    String key = Character.valueOf((char)i).toString().toLowerCase();
                    map.merge(key,Integer.valueOf(1),(v1,v2)->v1+v2);},
                        (map1,map2)->mergeMaps(map1,map2));
    }

    public static void mergeMaps(Map<String,Integer> map1, Map<String,Integer> map2){
        System.out.println("Hi");
        map2.forEach((key,value)->map1.merge(key,value,(v1,v2)->v1+v2));
//        return map1;
    }

    public static Map<String,Integer> strToMap2(String str){
        return str.chars()
                .boxed()
                .collect(groupingBy(i->Character.valueOf((char)i.intValue())
                                .toString().toLowerCase(), reducing(0,i->1,(l,r)->l+r)));
    }

    public static Map<String,Long> strToMap3(String str){
        return str.chars()
                .boxed()
                .collect(groupingBy(StringToMap::IToSLower, counting()));
    }

    public static Map<String,Integer> strToMap4(String str){
        return str.chars()
                .boxed()
                .collect(toMap(StringToMap::IToSLower, k->1, (l,r)->l+r));
    }

    public static Map<String,String> strGrouping (String str){
                return str.chars()
                .boxed()
                .collect(groupingBy(i->Character.valueOf((char)i.intValue())
                                .toString().toLowerCase(),
                                reducing(
                                        "",
                                        e->Character.valueOf((char)e.intValue()).toString(),
                                        String::concat
                                )));
    }

    public static Map<String,List<String>> strGroupingListOfString (String str){
        return str.chars()
                .boxed()
                .collect(groupingBy(StringToMap::IToSLower,
                        mapping(StringToMap::IToS,toList())));
    }

    public static void main(String[] args) {
        String str = "aaaavnjsfjjjsss";
        System.out.println(strToMap4("aaaavnjsfjjjsss"));


    }

    public static Map<String, Integer> valueToInteger(Map<String, Long> map){
        return map.entrySet().stream().collect(toMap(k->k.getKey(),v->v.getValue().intValue() ));
    }

    public static String IToS(Integer i){
        return Character.valueOf((char)i.intValue()).toString();
    }
    public static String IToSLower(Integer i){
        return Character.valueOf((char)i.intValue()).toString();
    }
}
