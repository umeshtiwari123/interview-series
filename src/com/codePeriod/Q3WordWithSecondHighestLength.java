package com.codePeriod;

import java.util.Arrays;
import java.util.Comparator;

public class Q3WordWithSecondHighestLength {

    public static void main(String[] args) {
        String str = "I am learning Stream API in Java";

        String res = Arrays
                .stream(str.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(res);


        }
}

