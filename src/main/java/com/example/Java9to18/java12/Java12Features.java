package com.example.Java9to18.java12;

import lombok.extern.slf4j.Slf4j;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class Java12Features {
    public static void main(String[] args) {

        // indentation
        String s = " Java 12 Features of demonstrating string Updated indentation";
        log.info(s.indent(5));
        log.info(s.indent(-1));

        // Transform()
        String s1 = "123";
        Integer transform = s1.transform(Integer::parseInt);
        log.info(String.valueOf(transform));

        // New Unicode Char Added
        log.info("\u265A");
        log.info("\u265B");
        log.info("\u2654");
        log.info("\u2655");

        //Compact Number Format
        NumberFormat compactNumberInstance = NumberFormat.getCompactNumberInstance();
        log.info(compactNumberInstance.format(1000));
        compactNumberInstance = NumberFormat.getCompactNumberInstance(Locale.CANADA, NumberFormat.Style.LONG);
        log.info(compactNumberInstance.format(100000));


        //teeing method ( Collectors, Collectors, BiFunction)
//        The teeing method is used to perform two separate collectors in parallel and then combine their results using a specified BiFunction.
        Result collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 15, 70).collect(Collectors.teeing(Collectors.counting(),
                Collectors.filtering(e -> Integer.parseInt(e.toString()) > 5, Collectors.toList()),
                Result::new)); // BiFunction
        log.info(collect.toString());
    }
}
