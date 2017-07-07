package com.insightfullogic.java8.myExemples.c4;

import com.insightfullogic.java8.myExemples.Band;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.Assert.*;

/**
 * Created by konstantin on 06.07.2017.
 */
public class PerformanceImplTest {

    List<Band> bands = new ArrayList<>(Arrays.asList(
            new Band("The Beatles", Arrays.asList("Lenon","McCartney","Star","Newman")),
            new Band("Bruce Dickenson",Arrays.asList("Bruce Dickenson")),
            new Band("Madonna",new ArrayList<String>()),
            new Band("Deep Purples", Arrays.asList("Gilen", "Blackmore", "Lord"))
    ));

    @Test
    public void getAllMusicians(){
        Performance p = new PerformanceImpl(bands, "BlaBlaShow");
        System.out.println(p.getAllMusicians().collect(Collectors.toList()));
        List<String> expected = Arrays.asList(
              "The Beatles - Lenon,McCartney,Star,Newman",
                "Bruce Dickenson",
                "Madonna",
                "Deep Purples - Gilen,Blackmore,Lord"
        );
        assertEquals(p.getAllMusicians().collect(Collectors.toList()), expected);
    }
}
