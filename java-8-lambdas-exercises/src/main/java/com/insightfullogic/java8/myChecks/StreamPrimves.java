package com.insightfullogic.java8.myChecks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by konstantin on 06.07.2017.
 */
public class StreamPrimves {
    public static void main(String[] args) {
//        Arrays.asList(1,2,3,4,5,6)
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(list.stream().mapToInt(Integer::intValue).reduce(0,(left, right) -> left+right*5));
    }
}
