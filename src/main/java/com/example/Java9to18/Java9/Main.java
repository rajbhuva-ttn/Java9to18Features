package com.example.Java9to18.Java9;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class Main {

    public static void main(String[] args) {

        //Interface private Static method
        Java9Interface java9Interface = new Java9Features();
        java9Interface.DefaultMethod();
        java9Interface.Method1();


        //try with Resources
        AutoClosableDemoClass autoClosableDemoClass = new AutoClosableDemoClass();
        try(autoClosableDemoClass) {
          log.info("Preforming Tasks");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Unmodifiable Collections
        List<Integer> integers = List.of(2, 4, 6, 7, 8);
//        integers.add(9); // Can not Add to the list
        log.info(integers.toString());

        //takeWhile
        List<Integer> list = integers.stream().takeWhile(e -> e % 2 == 0).toList();
        log.info(list.toString());

        //DropWhile
        List<Integer> list1 = integers.stream().dropWhile(e -> e % 2 == 0).toList();
        log.info(list1.toString());


        //ofNullable
        List<Integer> demoList = Arrays.asList(2, 4, 6, 7, 8,null);
        List<Integer> list2 = demoList.stream().flatMap(Stream::ofNullable).toList();
        log.info(list2.toString());


    }
}
