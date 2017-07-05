package com.insightfullogic.java8.myExemples.c3;

import com.insightfullogic.java8.myExemples.Album;
import com.insightfullogic.java8.myExemples.Song;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by konstantin on 04.07.2017.
 */
public class E2_StreamsSorting {
    public static void main(String[] args) {
        List<Album> albums =
                Stream.of(
                        new Album("Layla",
                                Stream.of(
                                        new Song("Hi", 2.22),
                                        new Song("Fetch", 1.45),
                                        new Song("Scroll", 2.55))
                                        .collect(Collectors.toList())),
                        new Album("Lilla",
                                Stream.of(
                                        new Song("Bye", 3.56),
                                        new Song("Pull", 4.01),
                                        new Song("River", 5.55))
                                        .collect(Collectors.toList()))
                ).collect(Collectors.toList());

        //вывод всех песен, сортировка по названию
        System.out.println(albums.stream()
                .flatMap(album -> album.getTracks().stream())
                .sorted(Comparator.comparing(song -> song.getName(), Comparator.reverseOrder()))
                .collect(Collectors.toList()));
    }
}
