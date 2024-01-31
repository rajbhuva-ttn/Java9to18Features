package com.example.Java9to18.Java13And14;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {

        // String Blocks
        String s = """
                {
                    THis is Java String Blocks
                    With BackSpace Char(\\) we can write in same line\
                }
                """;

        log.info(s);


        //Switch lambada expression and Yield to return
        Integer value = 2;
        String s1 = switch (value){
            case 1 -> {
                yield "1 selected";
            }
            case 2 -> {
                yield "2 Selected";
            }
            default -> "Default";
        };
        log.info(s1);

        //pattern matching InstanceOf with value
        Object o = 12;
        if(o instanceof Integer value1){
            log.info(String.valueOf(value1.getClass()));
        }


        //record class Demo
        Person p = new Person(1,"Raj");
        log.info(p.name());
        log.info(String.valueOf(p.id()));
        log.info(String.valueOf(p.hashCode()));
        log.info(p.toString());
    }
}
