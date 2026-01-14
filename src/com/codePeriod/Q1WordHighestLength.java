package com.codePeriod;

import java.util.Arrays;
import java.util.Comparator;

public class Q1WordHighestLength {
    /*
     * Find the word that has highest. length
     * I/P : String s = "I am learning Streams API in Java"
     * O/P : learning
     * */
    public static void main(String[] args) {

        String str = "I am learning Streams API in Java";

        String res = Arrays
                .stream(str.split(" "))
                .max(Comparator.comparing(String::length))
                .get();

        System.out.println(res);
    }
}
