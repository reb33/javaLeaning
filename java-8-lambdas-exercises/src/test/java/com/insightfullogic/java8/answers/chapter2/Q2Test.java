package com.insightfullogic.java8.answers.chapter2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.time.LocalDateTime;

/**
 * Created by konstantin on 03.07.2017.
 */
public class Q2Test {

    @Test
    public void testQ2Formatter(){
        String actual = Q2.threadLocalDateTimeFormatter.get().format(Q2.threadLocalDateTime.get());
        assertEquals("03-07-2017",actual);
    }
}
