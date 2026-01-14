package com.codePeriod;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q12FindTheFirstRepeatedCharacter {

    public static void main(String[] args) {

        String s = "Hello World";

        Map<Character, Long> charMap = s.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()));

//        charMap.forEach((k,v)->System.out.println(k+"=="+v));

        char res = charMap.entrySet().stream()
                .filter(m->m.getValue()>1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(res);


    }
}
