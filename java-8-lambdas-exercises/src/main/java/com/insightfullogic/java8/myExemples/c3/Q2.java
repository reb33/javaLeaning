package com.insightfullogic.java8.myExemples.c3;

import com.insightfullogic.java8.myExemples.Band;

import java.util.List;

/**
 * Created by konstantin on 04.07.2017.
 */
public class Q2 {

    public static int getCountMembers(List<Band> bands){
        return (int)bands.stream()
                .flatMap(band -> band.getMembers().stream())
                .count();

    }

    public static int getCountMembersOld(List<Band> bands){
        int totalMembers = 0;
        for (Band artist : bands) {
            List<String> members = artist.getMembers();
            totalMembers += members.size();
        }
        return totalMembers;
    }
}
