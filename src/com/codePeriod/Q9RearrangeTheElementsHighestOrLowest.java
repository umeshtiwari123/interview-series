package com.codePeriod;

import java.util.Arrays;
import java.util.Collections;

public class Q9RearrangeTheElementsHighestOrLowest {

    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5};

        Arrays.stream(arr).mapToObj(x->x)
                .sorted()
                .forEach(System.out::println);


        Arrays.stream(arr).mapToObj(x->x)
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

    }
}
