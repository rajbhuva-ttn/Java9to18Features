package com.example.Java9to18.java12;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Result {

    Long count;
    List<Integer> greaterThanFiveList;

}
