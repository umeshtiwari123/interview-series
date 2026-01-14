package com.EY.L1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondNonRepeatingCharacter {

    public static void main(String[] args) {
        String input = "Java is a Programming language";

        String result =	Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .skip(1)
                .map(Map.Entry::getKey)
		        .findFirst()
                .orElse(null);

        Map<Character, Long> charMap = input.chars()
                .mapToObj(c->(char)c)
                .filter(c->c!=' ')
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        Character secondNonRepeating = charMap.entrySet().stream()
                .filter(e->e.getValue() ==1)
                .skip(1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(secondNonRepeating);

        System.out.println("--------------");

        System.out.println(result);
    }
}
