package com.insightfullogic.java8.myExemples.samples.grouping;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.SampleData;
import com.insightfullogic.java8.examples.chapter1.Track;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * Created by konstantin on 13.07.2017.
 */
public class AnotherGrouping {

    public static Map<String, Integer> albumsWithTime(List<Album> list){
        return list
                .stream()
                .collect(
                        groupingBy(Album::getName,
                        reducing(
                                0,
                                album -> album
                                    .getTracks()
                                    .map(Track::getLength)
                                    .reduce(0, Integer::sum),
                                Integer::sum)));
    }

    public static Map<String, Integer> albumsWithTime2(List<Album> list){
        return list.stream()
                .collect(groupingBy(Album::getName,
                        summingInt(album->album
                                .getTracks()
                                .mapToInt(Track::getLength)
                                .sum())));

    }


    public static void main(String[] args) {
        System.out.println(albumsWithTime(Arrays.asList(SampleData.manyTrackAlbum,SampleData.aLoveSupreme)));
    }
}
