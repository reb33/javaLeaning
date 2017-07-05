package com.insightfullogic.java8.myExemples;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Created by konstantin on 04.07.2017.
 */
@RequiredArgsConstructor
@Getter
@ToString
public class Album {
    @NonNull
    String name;
    @NonNull
    List<Song> tracks;
    List<String> musicians;
}
