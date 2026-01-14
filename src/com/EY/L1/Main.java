package com.EY.L1;

import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","Spring","API","Microservices");
        List<String> list2 = Arrays.asList("Java","Spring","API","Microservices");
        list.sort(Comparator.comparingInt(String::length));
//        list2.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println(list);
//        System.out.println(list2);

        list2.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}
