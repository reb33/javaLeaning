package com.insightfullogic.java8.myExemples.c4;

import com.insightfullogic.java8.myExemples.Band;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.StreamCorruptedException;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by konstantin on 06.07.2017.
 */
@AllArgsConstructor
@ToString
public class PerformanceImpl implements Performance {
    private List<Band> musicians;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Stream<Band> getMusicians() {
        return musicians.stream();
    }
}
