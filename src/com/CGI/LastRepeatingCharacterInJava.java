package com.CGI;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class LastRepeatingCharacterInJava {

    public static void main(String[] args) {


        String input = "swiss";

        Character result =input
                        .chars()
                        .mapToObj(c->(char)c)
                        .collect(Collectors.groupingBy(
                                Function.identity(), LinkedHashMap::new,
                                Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(e->e.getValue()==1)
                        .reduce((first,second)->second)
                        .map(Map.Entry::getKey)
                        .orElse(null);

        System.out.println(result);
    }


}
