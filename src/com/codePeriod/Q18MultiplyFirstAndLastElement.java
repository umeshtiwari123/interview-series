package com.codePeriod;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q18MultiplyFirstAndLastElement {

    public static void main(String[] args) {

        int[] arr = {4,5,1,7,2,9};

        IntStream.range(0, arr.length/2)
                .map(x->arr[x]*arr[arr.length-x-1])
                .forEach(System.out::println);

        System.out.println("=============");
        IntStream.range(0, arr.length / 2)
                .map(x -> arr[x] * arr[arr.length - x - 1])
                .forEach(x -> System.out.print(x + ", "));
        System.out.println();
        System.out.println("============");

            String result = IntStream.range(0, arr.length/2)
                    .map(x->arr[x]*arr[arr.length-x-1])
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(" , "));

        System.out.println(result);

        System.out.println("Interview Friendly");

        //int[] arr = {4, 5, 1, 7, 2, 9};

        StringJoiner joiner = new StringJoiner(", ");

        IntStream.range(0, arr.length / 2)
                .map(x -> arr[x] * arr[arr.length - x - 1])
                .forEach(x -> joiner.add(String.valueOf(x)));

        System.out.println(joiner);
    }
}
