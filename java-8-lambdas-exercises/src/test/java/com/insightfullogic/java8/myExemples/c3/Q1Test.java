package com.insightfullogic.java8.myExemples.c3;

import com.insightfullogic.java8.myExemples.Album;
import com.insightfullogic.java8.myExemples.Band;
import com.insightfullogic.java8.myExemples.Song;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.insightfullogic.java8.myExemples.c3.Q1.*;
import static org.junit.Assert.*;


/**
 * Created by konstantin on 04.07.2017.
 */
public class Q1Test {

    @Test
    public void addUpTest(){
        int result = addUp(Stream.of(1,2,4,6));
        System.out.println(result);
        assertEquals("Проверка суммы",13, result);
    }

    @Test
    public void membersFromBandsTest(){
        List<Band> bands = new ArrayList<>(Arrays.asList(
                new Band("The Beatles", new ArrayList<String>(Arrays.asList(
                        "Lenon", "Starr", "Halford", "Mcartny")),"Liverpul",null),
                new Band("Deep Purples", new ArrayList<String>(Arrays.asList(
                        "Gilmor","Blackmore","Lord")),"New York",null)
        ));
        bands.add(new Band("Arya", Arrays.asList(
                "Kipelov","Holstenin","Dubinin","Udalov","Terentiev"), "Moscow",null));
        Set<String> strings = membersFromBands(bands);
        System.out.println(strings);
        assertEquals(Stream.of("Lenon:Starr:Halford:Mcartny - Liverpul",
                "Gilmor:Blackmore:Lord - New York",
                "Kipelov:Holstenin:Dubinin:Udalov:Terentiev - Moscow").collect(Collectors.toSet()), strings);

    }

    @Test
    public void getSmallAlbumsTest(){
        List<Album> albums = Stream.of(
                new Album("Layla",
                        Stream.of(
                                new Song("Hi", 2.22),
                                new Song("Fetch", 1.45),
                                new Song("Scroll", 2.55))
                                .collect(Collectors.toList())),
                new Album("Lilla",
                        Stream.of(
                                new Song("Bye", 3.56),
                                new Song("Pull", 4.01))
                                .collect(Collectors.toList())),
                new Album("Santya",
                        Stream.of(
                                new Song("How much the fish", 4.33),
                                new Song("Afraid shoot the strangers", 8.12),
                                new Song("Final countdown", 5.55),
                                new Song("it's my life", 3.12))
                                .collect(Collectors.toList()))
        ).collect(Collectors.toList());
        Set<Album> strings = getSmallAlbums(albums);
        System.out.println(strings);
        Set<Album> expected = new HashSet<>();
        expected.add(albums.get(0));
        expected.add(albums.get(1));
        assertEquals(expected,strings);

    }
}
