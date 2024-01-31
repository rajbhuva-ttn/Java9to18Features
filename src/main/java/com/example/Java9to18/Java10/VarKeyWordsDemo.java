package com.example.Java9to18.Java10;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@Slf4j
public class VarKeyWordsDemo {


    public static void main(String[] args) {
        var list = new ArrayList<>();
        list.add(1);
        list.add("hello");
        log.info(list.toString());

//        var s1 = null; // can not Assign NullValue
        Consumer<Integer> c = (e) -> {
            log.info("Consumer");
        };

//        var c1 = (e) -> {   // Can not use with lambda expression
//            log.info("Consumer");
//        };

        //Strem Unmodifiable lIst
        List<Integer> a = List.of(1,2,3,5,6,7);
        List<Integer> list1 = a.stream().filter(e->e>3).collect(Collectors.toList());
        list1.add(9); // Able to add after Strem Opration with Collectors.toList()
        log.info(list1.toString());

        List<Integer> list2 = a.stream().filter(e->e>3).collect(Collectors.toUnmodifiableList());
//        list2.add(9); //cannot add after Strem Opration with Collectors.toUnmodifiableList(); OR .toList()
        log.info(list2.toString());

    }


}
