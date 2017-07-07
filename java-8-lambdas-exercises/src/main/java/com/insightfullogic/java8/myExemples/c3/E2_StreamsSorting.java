package com.insightfullogic.java8.myExemples.c3;

import com.insightfullogic.java8.myExemples.Album;
import com.insightfullogic.java8.myExemples.Song;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import static javafx.scene.input.KeyCode.R;

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
                                        new Song("Scroll", 2.55),
                                        new Song())
                                        .collect(Collectors.toList())),
                        new Album("Lilla",
                                Stream.of(
                                        new Song("Bye", 3.56),
                                        new Song("Pull", 4.01),
                                        new Song("River", 5.55))

                                        .collect(Collectors.toList()))
                ).collect(Collectors.toList());

        //вывод всех песен, сортировка по названию
        System.out.println(albums.stream().parallel()
                .flatMap(album -> album.getTracks().stream())
                .sorted(Comparator.comparing(song-> song.getName(), Comparator.nullsFirst(Comparator.reverseOrder())))
                .collect(Collector.of(ArrayList::new,
                        (ArrayList<Song> left, Song right) -> left.add(right),
                        (ArrayList<Song> left, ArrayList<Song> right)-> {left.addAll(right);return left;},
                        (ArrayList<Song> songs)->{songs.add(null); return songs;}
                        ))
//                .collect(Collectors.toList())
                    );
    }
}
