package com.wipro;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Collectors;
public class LatestInterview2 {
    /*
    *
    *
    String str = "the elephant is going to forest and looking for food and will sleep";

    Write a program to find the character which is present only once in this string.
    For Example: w
    * */



        public static void main(String[] args) {

            String str = "the elephant is going to forest and looking for food and will sleep";

            // split by space into words
            List<String> words = Arrays.asList(str.split(" "));

            // Take only the first letter of each word
            List<Character> firstLetters = words.stream()
                    .map(w -> w.charAt(0))
                    .collect(Collectors.toList());

            // Count occurrences
            Character result =
                    firstLetters.stream()
                            .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                            .entrySet()
                            .stream()
                            .filter(e -> e.getValue() == 1)
                            .map(Map.Entry::getKey)
                            .findFirst()
                            .orElse(null);

            System.out.println("First unique first-letter: " + result);
        }
    }

