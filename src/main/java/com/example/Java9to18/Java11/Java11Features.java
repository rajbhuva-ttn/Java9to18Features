package com.example.Java9to18.Java11;


import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;


@Slf4j
public class Java11Features {
    public static void main(String[] args) throws IOException {

        //isBlank()
        String s = "  ";
        log.info(String.valueOf(s.isBlank()));

        //lines()
        String s1 = "Hello\nWorld\nHello\nJava";
        s1.lines().forEach(System.out::println);

        //character can be contacted to String
        char c= '\u2000';
        String demo = " Hello Strip Demo ";
        String newString = c +demo;

        //Strip()
        String s2 = newString.strip();
        String s3 = newString.stripLeading();
        String s4 = newString.stripTrailing();
        log.info("DemoString : "+ newString );
        log.info("Strip: "+s2);
        log.info("LeadingStrip: "+s3);
        log.info("TrailingStrip: "+s4);

        //File Updates - writeString() and ReadString()

        Path path = Files.writeString(Files.createTempFile("Test",".txt"), "Hello Test file");
        log.info(String.valueOf(path));
        String s5 = Files.readString(path);
        log.info(s5);


        //isEmpty() method in Optional class
        Optional<String> string = Optional.empty();

        //Before java 11
        if(!string.isPresent()){
            log.info("Empty String!!!");
        }

        //After Java 11
        if(string.isEmpty()){
            log.info("Empty String!!!");
        }
    }
}
