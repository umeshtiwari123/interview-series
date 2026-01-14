package com.hcltech;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class L2 {

        public static void main(String[] args) {

            String name = "UmeshTiwari";

            Map<Character, Long> charCount = name.chars()
                    .mapToObj(c->(char)c)
                    .collect(Collectors.groupingBy(Function.identity(),  Collectors.counting()));

            System.out.println(charCount);

            int n = 45678 ;
            int sum = String.valueOf(n)
                    .chars()
                    .map(c->c-'0')
                    .sum();

            System.out.println(sum);

        }

}
