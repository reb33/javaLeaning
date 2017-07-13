package com.insightfullogic.java8.myExemples.samples.grouping;

import com.insightfullogic.java8.myExemples.Album;
import com.insightfullogic.java8.myExemples.Song;
import com.insightfullogic.java8.myExemples.c3.E1_Streams1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by konstantin on 11.07.2017.
 */
public class StringGrouping2 {
    private static List<Album> albums = E1_Streams1.albums;

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
//        List<String> list = Arrays.asList("aaa","bbb","ccc","eerdss");
//        System.out.println(listToString(list));
//        System.out.println(listToStr2(list));

        listNameSongs();
    }


    //мепа название альбома - список названий песен
    public static void listNameSongs() {
        Map<String, List<String>> listNameSongs = albums
                .stream()
                .collect(Collectors.groupingBy(Album::getName,
                        Collectors.reducing(new ArrayList<String>(),
                                album -> album.getTracks().stream().map(Song::getName).collect(Collectors.toList()),
                                (u, u2) -> u2)));
        System.out.println(listNameSongs);
    }

    //мепа название альбома - список названий песен
    public static void listNameSongs2() {
        Map<String, List<String>> listNameSongs = albums
                .stream()
                .collect(Collectors.toMap(Album::getName,
                        album -> album.getTracks().
                                stream().
                                map(Song::getName).
                                collect(Collectors.toList())));
        listNameSongs.entrySet().forEach(stringListEntry -> System.out.println(stringListEntry));
    }
}
