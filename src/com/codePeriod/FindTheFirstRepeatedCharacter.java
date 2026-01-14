package com.codePeriod;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheFirstRepeatedCharacter {

    public static void main(String[] args) {
        String input = "Java is a programming Language";

        Map<Character, Long> charMap = input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()));

            Character firstRepeatingChar = charMap.entrySet().stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(firstRepeatingChar);


    }
}
