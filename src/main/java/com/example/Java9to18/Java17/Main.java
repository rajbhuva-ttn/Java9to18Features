package com.example.Java9to18.Java17;

import lombok.extern.slf4j.Slf4j;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

@Slf4j
public class Main {

    public static void main(String[] args) {

        //Random Number Generator
//        RandomGenerator randomGenerator = RandomGeneratorFactory.getDefault().create();
//        RandomGeneratorFactory.all().map(e->e.group()+":::"+e.name()).toList().forEach(System.out::println);
        RandomGenerator randomGenerator = RandomGeneratorFactory.of("L64X256MixRandom").create(552);
        for(int i= 0; i<=5;i++){
            log.info(String.valueOf(randomGenerator.nextInt(10)));

        }




    }
}
