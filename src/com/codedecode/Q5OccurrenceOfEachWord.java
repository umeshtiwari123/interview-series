package com.codedecode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;


public class Q5OccurrenceOfEachWord {

    public static void main(String[] args) {

        String s = "I am learning Streams API in Java";

        Map<String, Long> charMap =Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charMap);

        charMap.forEach((key, value) -> System.out.print(key+"-->"+value+ " , "));


    }
}
