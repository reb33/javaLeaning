package com.insightfullogic.java8.myExemples.c4;

import com.insightfullogic.java8.myExemples.Band;

import java.util.stream.Stream;

/**
 * Created by konstantin on 06.07.2017.
 */
public interface Performance {
    public String getName();

    public Stream<Band> getMusicians();

    default Stream<String> getAllMusicians(){
        return getMusicians().map(band -> band.getName()+(band.getMembers().size()>1?band.getMembers()
                .stream()
                .reduce("",(s, s2) -> s.isEmpty()?" - "+s2:s+","+s2):""));

    }

}
