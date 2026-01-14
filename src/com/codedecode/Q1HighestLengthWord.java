package com.codedecode;

import java.util.Arrays;
import java.util.Comparator;

public class Q1HighestLengthWord {

    public static void main(String[] args) {

        String s = "I am learning Streams API in Java";

        String ans = Arrays.stream(s.split(" "))
                        .max(Comparator.comparing(String::length))
                                .get();

        System.out.println(ans);

    }
}
