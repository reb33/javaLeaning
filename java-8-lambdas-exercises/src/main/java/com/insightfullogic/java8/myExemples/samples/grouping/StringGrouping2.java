package com.insightfullogic.java8.myExemples.samples.grouping;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Created by konstantin on 11.07.2017.
 */
public class StringGrouping2 {

    public static String listToString(List<String> list){
        return list.stream().reduce(new StringJoiner(",","[","]"),
                (stringJoiner, s) -> {
                    System.out.println("accumulator");
                    return stringJoiner.add(s);
                },
                (stringJoiner, stringJoiner2) -> {
                    System.out.println("combiner");
                    return stringJoiner.merge(stringJoiner2);
                }).toString();
    }

    public static String listToStr2(List<String> list){
        return list.stream().collect(()->new StringJoiner(",","[","]"),
                (stringJoiner, s) -> stringJoiner.add(s),
                (stringJoiner, stringJoiner2) -> stringJoiner.merge(stringJoiner2)).toString();
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa","bbb","ccc","eerdss");
        System.out.println(listToString(list));
        System.out.println(listToStr2(list));
    }
}
