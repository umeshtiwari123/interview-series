package com.codePeriod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q14CreateListThatContainsIntegers {

    public static void main(String[] args) {

        String[] s = {"abc", "123", "456", "xyz"};

        List<Integer> ans = Arrays.stream(s)
                .filter(x->x.matches("[0-9]+"))
                .map(x->Integer.valueOf(x))
                .collect(Collectors.toList());

        System.out.println(ans);
    }
}
