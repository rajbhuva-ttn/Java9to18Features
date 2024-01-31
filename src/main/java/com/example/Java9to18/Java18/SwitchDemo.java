package com.example.Java9to18.Java18;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwitchDemo {
    public static void main(String[] args) {
        Object o = null;

        //Switch all cases to be defined (Exhaustiveness) and in ordered (Level Dominance)
        switch (o){
            //case CharSequence c -> log.info((String) o);
            case String s -> log.info((String) o); // Dominated level of switch -> should be before CharSequence
            case null -> log.info("null value");
            default -> log.info("INVALID"); //Need to defined Default value OR provide all cases
        }

        //JwebServer
        //Default CharacterSet = UTF-8  is set after java 18

        //java -Dfile.encoding=COMPACT  (TO set Machine CharSet)
        //java -Dfile.encoding=UTF-8  (TO set Default CharSet)
    }
}
