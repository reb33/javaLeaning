package com.insightfullogic.java8.myExemples.c3;

import com.insightfullogic.java8.myExemples.Band;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static com.insightfullogic.java8.myExemples.c3.Q2.*;
import static org.junit.Assert.*;

/**
 * Created by konstantin on 04.07.2017.
 */
public class Q2Test {
    @Test
    public void getCountTest(){
        List<Band> bands = new ArrayList<>(Arrays.asList(
                new Band("The Beatles", Arrays.asList(
                        "Lenon", "Starr", "Halford", "Mcartny"),"Liverpul",null),
                new Band("Deep Purples", Arrays.asList(
                        "Gilmor","Blackmore","Lord"),"New York",null)
        ));
        bands.add(new Band("Arya", Arrays.asList(
                "Kipelov","Holstenin","Dubinin","Udalov","Terentiev"), "Moscow",null));

        int old = getCountMembersOld(bands);
        int count = getCountMembers(bands);
        System.out.println(old+"  "+count);
        assertEquals(old, count);
    }
}
