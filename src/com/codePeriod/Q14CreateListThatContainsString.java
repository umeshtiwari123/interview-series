package com.codePeriod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q14CreateListThatContainsString {

    public static void main(String[] args) {

        String[] str = {"abc", "123", "456", "def"};

        List<String> res = Arrays.stream(str)
                .filter(x->x.matches("[a-z]+"))
                .collect(Collectors.toList());

        System.out.println(res);


    }
}
