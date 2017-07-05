package com.insightfullogic.java8.myExemples;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * Created by konstantin on 04.07.2017.
 */
@RequiredArgsConstructor
@Getter
@AllArgsConstructor
public class Band {
    @NonNull
    String name;
    @NonNull
    List<String> members;
    String origin;
    List<Album> albums;
}
