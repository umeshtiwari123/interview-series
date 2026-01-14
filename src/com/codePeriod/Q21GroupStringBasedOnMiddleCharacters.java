package com.codePeriod;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q21GroupStringBasedOnMiddleCharacters {

    public static void main(String[] args) {


        String[] str = {"ewe", "jji", "jhj", "kwk", "aha"};

        String s = "abc".substring(1,2);

        System.out.println(s);

        System.out.println(Stream.of(str)
                .collect(Collectors.groupingBy(
                        x->x.toString().substring(1,2)
                )));
    }
}
