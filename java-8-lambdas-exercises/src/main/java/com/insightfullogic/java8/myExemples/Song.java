package com.insightfullogic.java8.myExemples;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by konstantin on 04.07.2017.
 */
@ToString
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class Song {
    String name;
    double duration;
}
