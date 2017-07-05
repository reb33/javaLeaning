package com.insightfullogic.java8.myExemples;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by konstantin on 04.07.2017.
 */
@AllArgsConstructor
@ToString
@Getter
public class Track {
    private Engine engine;
    private int old;
    private String name;
    private int cost;
}
