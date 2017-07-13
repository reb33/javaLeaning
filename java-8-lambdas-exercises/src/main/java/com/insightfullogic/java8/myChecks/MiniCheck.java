package com.insightfullogic.java8.myChecks;

import java.util.Arrays;
import java.util.List;

/**
 * Created by konstantin on 13.07.2017.
 */
public class MiniCheck {

    public static void collectToArray(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        Integer[] mas1 = new Integer[list.size()];
        Integer[] mas2 = list.toArray(mas1);
        System.out.println(mas1==mas2);

        mas1 = new Integer[3];
        mas2 = list.toArray(mas1);
        System.out.println(mas1==mas2);
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));
    }

    public static void main(String[] args) {
        collectToArray();
    }
}
