package com.example.Java9to18.Java17.SwitchDemo;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(5);


        //Switch with Pattern
        //Null cases are allowed in java 17
        switch (shape){
            case Circle c -> log.info(String.valueOf(c.radius()*2));
            case Rectangle r ->log.info(String.valueOf(r.width()*r.length()*2));
            case null -> log.info("Null value Encountered");
            default -> log.info("Invalid");
        };

    }
}
