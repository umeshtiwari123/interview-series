package com.codePeriod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q23SortListOfStringsInAlphabeticalOrder {

    public static void main(String[] args) {

        List<String> str = Arrays.asList("Zudio", "Puma", "Adidas", "MAC", "H&M");

        List<String> sortedStr = str.stream().sorted().collect(Collectors.toList());


        System.out.println(sortedStr);

    }
}
