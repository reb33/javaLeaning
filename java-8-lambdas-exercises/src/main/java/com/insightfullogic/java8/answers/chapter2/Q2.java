package com.insightfullogic.java8.answers.chapter2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by konstantin on 03.07.2017.
 */
public class Q2 {
    public static ThreadLocal<DateTimeFormatter> threadLocalDateTimeFormatter
        = new ThreadLocal<>().withInitial(()->DateTimeFormatter.ofPattern("dd-MM-YYYY"));
    public static ThreadLocal<LocalDateTime>  threadLocalDateTime
        = new ThreadLocal<>().withInitial(() -> LocalDateTime.of(2017,07,03,11,11));

    public static void main(String[] args) {

        System.out.println(threadLocalDateTime.get().format(threadLocalDateTimeFormatter.get()));
    }
}
