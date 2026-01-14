package com.codedecode;

import java.util.Arrays;
import java.util.Comparator;

public class Q3SecondHighestLengthWord {

    public static void main(String[] args) {

        String s = "I am learning streams api in java";

        String res = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1).findFirst().get();

        System.out.println(res);
    }
}
