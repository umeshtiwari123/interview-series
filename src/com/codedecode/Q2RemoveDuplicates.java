package com.codedecode;

import java.util.Arrays;

public class Q2RemoveDuplicates {

    public static void main(String[] args) {

        String s = "dabcadefg";

        s.chars().distinct().mapToObj(c->(char)c).forEach(System.out::print);
        System.out.println();

        Arrays.stream(s.split("")).distinct().forEach(System.out::print);
    }
}
