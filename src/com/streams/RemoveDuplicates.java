package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String input = "programming";

        String result = input.chars().mapToObj(c->String.valueOf((char)c)).distinct()
                .collect(Collectors.joining());

        System.out.println(result);

        Integer[] numbers = {1,2,2,3,4,4,5};

        Integer[] unique = Arrays.stream(numbers)
                .distinct()
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(unique));

        List<Integer> unique2 = Arrays.stream(numbers)
                .collect(Collectors.toSet())
                .stream()
                .collect(Collectors.toList());

        System.out.println(unique2);
    }
}
