package com.durgasoft.Set;


import java.util.*;
import java.util.stream.Collectors;

public class Demo {


        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6, 7);

            // Find non-duplicates using Collections.frequency()
            List<Integer> nonDuplicates = numbers.stream()
                    .filter(num -> Collections.frequency(numbers, num) == 1)  // Predicate<Integer>
                    .collect(Collectors.toList());

            System.out.println("Non-duplicates: " + nonDuplicates);
        }
    }


