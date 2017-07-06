package com.insightfullogic.java8.myChecks;

import lombok.ToString;

import java.util.Optional;

/**
 * Created by konstantin on 06.07.2017.
 */
@ToString
public class CheckOptional {

    public static void main(String[] args) {
        String str = "a";
        Optional<String> opt1 = Optional.ofNullable(str);
        System.out.println(opt1.orElseGet(()->"b"));
    }
}
