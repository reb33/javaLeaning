package com.insightfullogic.java8.myExemples.c3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Created by konstantin on 04.07.2017.
 */
public class Q7 {
    public static Optional<String> getStrMaxLowercase(List<String> strings){
        return strings
                .stream()
                .max(Comparator.comparing(str-> str
                                    .chars()
                                    .filter(Character::isLowerCase)
                                    .count()));
    }
}
