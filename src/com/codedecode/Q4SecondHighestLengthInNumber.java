package com.codedecode;

import java.util.Arrays;
import java.util.Comparator;

public class Q4SecondHighestLengthInNumber {

    public static void main(String[] args) {

        String s = "I am learning Streams API in Java";

        int ans = Arrays.stream(s.split(" "))
                .map(x->x.length())
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(ans);
    }
}
