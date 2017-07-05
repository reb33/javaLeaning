package com.insightfullogic.java8.myExemples.c3;

/**
 * Created by konstantin on 04.07.2017.
 */
public class Q6 {

    public static int getCountLowercase(String str){
        return (int)str
            .chars()
            .filter(Character::isLowerCase)
                .count();
    }
}
