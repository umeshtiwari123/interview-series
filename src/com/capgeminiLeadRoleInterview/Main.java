package com.capgeminiLeadRoleInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Umesh Tiwari", "Rahul Kumar",
                "Ankit Mishra");

        List<String> titles = names.stream()
                .map(n -> n.substring(n.lastIndexOf(" ") + 1))
                .collect(Collectors.toList());

        System.out.println(titles);

        String name = "Rahul";

        String sorted = name.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(" , "));

        System.out.println(sorted);

    }
}