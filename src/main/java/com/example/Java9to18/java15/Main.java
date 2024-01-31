package com.example.Java9to18.java15;

import com.example.Java9to18.java15.SealedClass.Employee;
import com.example.Java9to18.java15.SealedClass.Students;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Students();
        log.info(employee1.getDepartment().toString());
    }


}
