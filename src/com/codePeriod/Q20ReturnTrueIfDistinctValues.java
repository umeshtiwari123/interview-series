package com.codePeriod;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q20ReturnTrueIfDistinctValues {

    public static void main(String[] args) {

        int[] arr = {5, 4, 1, 2, 8, 0};

        List<Integer> list = Arrays.stream(arr).boxed()
                .collect(Collectors.toList());

        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));

        Collection<Long> values = map.values();

        boolean distinctChecker = values.stream().noneMatch(x->x>1);

        System.out.println(distinctChecker);




    }
}
