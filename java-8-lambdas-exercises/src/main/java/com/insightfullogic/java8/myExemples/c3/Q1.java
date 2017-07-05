package com.insightfullogic.java8.myExemples.c3;

import com.insightfullogic.java8.myExemples.Album;
import com.insightfullogic.java8.myExemples.Band;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by konstantin on 04.07.2017.
 */
public class Q1 {

    public static int addUp(Stream<Integer> ints){
        return ints.reduce(0, (sum, el)->sum+el);
    }

    public static Set<String> membersFromBands(List<Band> bands){
        return bands.stream()
                .map(band -> band
                        .getMembers()
                        .stream()
                        .reduce("", (allMembers, name)-> allMembers.isEmpty()?name:allMembers+":"+name)
                        +" - "+band.getOrigin())
                .collect(Collectors.toSet());
    }

    public static Set<Album> getSmallAlbums(List<Album> albums){
        return albums.stream()
                .filter(album -> album.getTracks().size()<=3)
                .collect(Collectors.toSet());
    }
}
