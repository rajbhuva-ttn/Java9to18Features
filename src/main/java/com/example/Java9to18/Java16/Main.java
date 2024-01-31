package com.example.Java9to18.Java16;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.core.Local;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,56,7,89);
        //Befor Java 16
        List<String> s = list.stream().map(String::valueOf).collect(Collectors.toList());

        //After Java 16 (.toList())
        List<String> ListString = list.stream().map(String::valueOf).toList();

        log.info(list.toString());
        log.info(ListString.toString());

        //Record Demo
        InnerClassDemo innerClassDemo = new InnerClassDemo();
        innerClassDemo.getName();


        // 'B' -> shows pattern like 'in the afternoon'
        LocalTime time = LocalTime.parse("14:42:11.1234");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss B");
        log.info(time.format(formatter));

    }

    public static class InnerClassDemo{
        //can use Record inside InnerClass
        Person p = new Person("Raj",22);
        public String getName(){
            return p.name();
        }
    }
}
