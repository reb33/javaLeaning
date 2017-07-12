package com.insightfullogic.java8.exercises.chapter5;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.exercises.Exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class LongestName {
    static Comparator<Artist> byNameLength = Comparator.comparing(artist -> artist.getName().length());
    static Stream<String> names = Stream.of("John Lennon", "Paul McCartney", "George Harrison",
            "Ringo Starr", "Pete Best", "Stuart Sutcliffe");

    public static Artist byReduce(List<Artist> artists) {

            return artists.stream().reduce((s, s2) -> byNameLength.compare(s,s2)>0?s:s2).get();
    }

    public static Artist byCollecting(List<Artist> artists) {
        return artists.stream()
                .collect(Collectors.maxBy(byNameLength))
                .orElseThrow(RuntimeException::new);
    }

    public static void main(String[] args) {
//
    }

}
