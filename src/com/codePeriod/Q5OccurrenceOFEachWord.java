package com.codePeriod;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q5OccurrenceOFEachWord {

    public static void main(String[] args) {


        String s = "I am learning Streams API in Java Java";

        Map<String, Long> charMap = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new,  Collectors.counting()));

        System.out.println(charMap);

        charMap.forEach((k, v) -> System.out.print(k + ":" + v + " "));

    }
}
