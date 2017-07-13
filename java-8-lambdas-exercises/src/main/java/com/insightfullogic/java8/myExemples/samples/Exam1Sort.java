package com.insightfullogic.java8.myExemples.samples;

import com.google.common.collect.Range;
import com.google.common.collect.Streams;
import com.sun.xml.internal.ws.util.StreamUtils;

import javax.xml.stream.StreamFilter;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static java.util.stream.Collectors.*;

/**
 * Created by konstantin on 12.07.2017.
 */
public class Exam1Sort {
    public static void aaa(int[] mass){

        Integer[] mass1 = Arrays.stream(mass).boxed().collect(toList()).toArray(new Integer[0]);
        List<Integer> res = new ArrayList<>();
//        if (mass.length% 2==0){
//            mass1 = Arrays.copyOfRange(mass,0,Integer.valueOf(mass.length/2));


        Arrays.sort(mass1, 0, Integer.valueOf(mass.length / 2), Comparator.reverseOrder());
        Arrays.sort(mass1,mass.length-Integer.valueOf(mass.length/2), mass.length, Comparator.reverseOrder());

        for (int i=0;i<mass1.length;i++){
            res.add(mass[i]-mass1[i]);
        }
        System.out.println(res);
//        }else {
//            mass1 = Arrays.copyOfRange(mass,0,mass.length%2);
//            mass2 = new int[]{mass[mass.length%2+1]};
//            mass3 = Arrays.copyOfRange(mass,mass.length%2+2,mass.length);
//        }

    }

    public static void aaa2(int[] mass){

//        AtomicInteger index = new AtomicInteger(0);
        List<Integer>  sub1 = IntStream.range(0,mass.length/2)
                .mapToObj(i->mass[i])
                .sorted(Comparator.reverseOrder())
                .collect(toList());
        List<Integer> sub2 = IntStream.range(mass.length-mass.length/2, mass.length)
                .mapToObj(i->mass[i])
                .sorted(Comparator.reverseOrder())
                .collect(toList());
        System.out.println(IntStream.range(0,mass.length)
                .map(i->{
                      if (i<mass.length/2)
                          return mass[i]-sub1.get(i);
                      else if (i>=mass.length-mass.length/2)
                          return mass[i]-sub2.get(i-mass.length/2-(mass.length-mass.length/2*2));
                      else
                          return mass[i]=0;

        }).boxed().collect(toList()));
    }

    public static void main(String[] args){
        aaa(new int[]{1,2,3,4,5,6});
    }
}
