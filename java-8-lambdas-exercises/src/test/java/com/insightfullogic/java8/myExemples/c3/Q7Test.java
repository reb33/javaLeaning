package com.insightfullogic.java8.myExemples.c3;

import org.junit.Test;
import static org.junit.Assert.*;
import static com.insightfullogic.java8.myExemples.c3.Q7.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by konstantin on 04.07.2017.
 */
public class Q7Test {
    @Test
    public void getStrMaxLowercaseTest(){
        List<String> strs = Arrays.asList("WwwWW", "AaaaCC", "123A", "zxcv");
        System.out.println(getStrMaxLowercase(strs));
        assertEquals("zxcv", getStrMaxLowercase(strs).get());
        System.out.println(getStrMaxLowercase(new ArrayList<>()));
    }
}
