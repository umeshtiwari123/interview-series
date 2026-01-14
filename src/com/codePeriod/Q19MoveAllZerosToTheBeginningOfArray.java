package com.codePeriod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q19MoveAllZerosToTheBeginningOfArray {

    public static void main(String[] args) {

        int[] arr = {5, 0, 1, 0, 8, 0};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        list.stream()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<Integer> zeros = list.stream().filter(z->z==0).collect(Collectors.toList());

        List<Integer> NonZeros = list.stream().filter(z->z!=0).collect(Collectors.toList());

        List<Integer> listFinal = new ArrayList<>();

        listFinal.addAll(zeros);
        listFinal.addAll(NonZeros);

        System.out.println(listFinal);


        List<Integer> ans = list.stream()
                .collect(Collectors.partitioningBy(x->x!=0)).values()
                .stream().flatMap(x->x.stream())
                .collect(Collectors.toList());

        System.out.println(ans);
    }
}
