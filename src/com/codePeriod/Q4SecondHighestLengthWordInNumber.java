package com.codePeriod;

import java.util.Arrays;
import java.util.Comparator;

public class Q4SecondHighestLengthWordInNumber {
    /*
    * Second Highest Length Word
    * String s ="I am learning Streams API in Java"
    * o/p : 7
    * */
    public static void main(String[] args) {

        String s ="I am learning Streams API in Java";

        int res = Arrays.stream(s.split(" "))
                .map(x->x.length())
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();


        System.out.println(res);
    }
}
