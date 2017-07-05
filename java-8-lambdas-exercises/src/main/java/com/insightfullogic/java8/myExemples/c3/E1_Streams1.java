package com.insightfullogic.java8.myExemples.c3;


import com.insightfullogic.java8.myExemples.Album;
import com.insightfullogic.java8.myExemples.Engine;
import com.insightfullogic.java8.myExemples.Song;
import com.insightfullogic.java8.myExemples.Track;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by konstantin on 04.07.2017.
 */
public class E1_Streams1 {

    public static void main(String[] args) {
        List<Track> tracks = Stream.of(new Track(new Engine(120, 1.6), 10,"Man", 500),
                new Track(new Engine(140, 1.8), 15,"Spirit", 550),
                new Track(new Engine(160, 1.7), 7,"Tiger", 600),
                new Track(new Engine(80, 2.4), 17,"Bull", 400))
                .collect(Collectors.toList());
        tracks.add(new Track(new Engine(200, 2.6), 10, "Mustang", 700));


//        System.out.println(tracks);
        //общая стоимость
        int generalCost =
                tracks.stream().map(track -> track.getCost()).reduce(0, (genCost, elCost)->genCost+elCost);
        System.out.println(generalCost);

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
        //общая длительность
        double generalDuration = albums
                .stream()
                .flatMap(album -> album.getTracks().stream())
                .map(track -> track.getDuration())
                .reduce(0d, (genDur, elDur)->elDur+genDur);
        System.out.println(generalDuration);

        //самый длинный трек
        double maxDuration = albums
                .stream()
                .flatMap(album -> album.getTracks().stream())
                .max(Comparator.comparing(song -> song.getDuration()))
                .get().getDuration();
        System.out.println(maxDuration);

        //самый короткий трек
        double minDuration = albums
                .stream()
                .flatMap(album -> album.getTracks().stream())
                .min(Comparator.comparing(song -> song.getDuration()))
                .get().getDuration();
        System.out.println(minDuration);

        //список все произведений звучащих от 2.30 до 4
        List<Song> songMiddle = albums
                .stream()
                .flatMap(album -> album.getTracks().stream())
                .filter(song -> song.getDuration()>=2.30 && song.getDuration()<=4)
                .collect(Collectors.toList());
        System.out.println(songMiddle);
    }

}
