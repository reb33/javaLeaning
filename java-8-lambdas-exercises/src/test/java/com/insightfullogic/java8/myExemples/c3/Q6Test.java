package com.insightfullogic.java8.myExemples.c3;

import org.junit.Test;
import static org.junit.Assert.*;
import static com.insightfullogic.java8.myExemples.c3.Q6.*;

/**
 * Created by konstantin on 04.07.2017.
 */
public class Q6Test {
    @Test
    public void getCountTest(){
        System.out.println(getCountLowercase("wes234Krf8bndgI"));
        assertEquals(9, getCountLowercase("wes234Krf8bndgI"));
    }
}
