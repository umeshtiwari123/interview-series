package com.codedecode;

import java.util.*;
public class SortAlphabeticallySameLength {

    public static void main(String[] args) {
        String s = "I am learning abcd api in java";
        String res = Arrays.stream(s.split(" "))
                .sorted(
                        Comparator.comparingInt(String::length)
                                .reversed()
                                .thenComparing(Comparator.naturalOrder())   // alphabetical
                )
                .skip(2)
                .findFirst()
                .orElse(null);

        System.out.println(res);
    }
}
