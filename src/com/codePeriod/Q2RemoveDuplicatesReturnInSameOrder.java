package com.codePeriod;

import java.util.Arrays;

public class Q2RemoveDuplicatesReturnInSameOrder {
/*
* Q2 : Remove Duplicates from the String and return in the same order
* I/P: String s = "dabcadefg"
* O/P: dabcefg
* */
    public static void main(String[] args) {

        String str = "dabcadefg";

        str.chars().mapToObj(c->(char)c).distinct().forEach(System.out::print);
        System.out.println();
        Arrays.stream(str.split("")).distinct().forEach(System.out::print);
    }
}
