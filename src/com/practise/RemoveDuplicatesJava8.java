package com.practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicatesJava8 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,2,3,3,4,5,6,6,7,8,9,9);

        List<Integer> nonDuplicates = integerList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue()==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Non Duplicates are: "+nonDuplicates);

        List<Integer> duplicates = integerList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Duplicates are :"+duplicates);


    }
}
