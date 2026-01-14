package com.capgemini25Dec2025.L1;

import java.util.*;
import java.util.stream.*;
public class FindDuplicatesUsingJava8 {

    public static void main(String[] args) {

                List<Integer> list = Arrays.asList(1,2,3,2,4,5,6,3);

                Set<Integer> duplicates = list.stream()
                        .collect(Collectors.groupingBy(
                                e->e,
                                Collectors.counting()
                        ))
                        .entrySet().stream()
                        .filter(e->e.getValue()>1)
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toSet());

                System.out.println(duplicates);
            }
        }


