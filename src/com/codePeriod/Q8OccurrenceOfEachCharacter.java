package com.codePeriod;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Q8OccurrenceOfEachCharacter {
        /*
        * Find the occurrence of each character :
        *
        * I/P String s = "Mississippi";
        *
        * O/P = {p = 2, s=4, i=4, M = 1}
        * */
    public static void main(String[] args) {

        String str = "Mississippi";

        Map<String, Long> charOccurrence = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(x->x, LinkedHashMap::new, Collectors.counting()));

        System.out.println(charOccurrence);
    }
}
