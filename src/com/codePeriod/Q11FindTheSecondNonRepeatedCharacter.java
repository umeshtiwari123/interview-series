package com.codePeriod;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q11FindTheSecondNonRepeatedCharacter {

    public static void main(String[] args) {


        String input = "Java is a Programming Language";

        Map<Character, Long> charMap = input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting()));

        Character secondNonRepeating = charMap.entrySet().stream()
                .filter(e->e.getValue()==1)
                .map(Map.Entry::getKey)
                .skip(1)
                .findFirst()
                .orElse(null);

//        System.out.println(charMap);
        System.out.println(secondNonRepeating);




    }
}
