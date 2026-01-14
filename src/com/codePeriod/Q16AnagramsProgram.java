package com.codePeriod;

import java.util.*;
import java.util.stream.Collectors;

public class Q16AnagramsProgram {

    public static void main(String[] args) {
        String[] s = {"pat", "tap", "pan","nap","Team", "meat","tree"};

        List<String> list = Arrays.asList(s);



       Map<Object, List<String>> ans = list.stream().collect(Collectors.groupingBy(x->
                Arrays.stream(x.toLowerCase().split(""))
                        .sorted()
                        .collect(Collectors.toList())));

        Collection<List<String>> res = list.stream().collect(Collectors.groupingBy(x->
                Arrays.stream(x.toLowerCase().split(""))
                        .sorted()
                        .collect(Collectors.toList()))).values();
        System.out.println(ans);
        System.out.println(res);

        System.out.println("-----------------------------");
        List<String> result = Arrays.stream(s)
                .collect(Collectors.groupingBy(
                        word ->{
                            char[] ch = word.toLowerCase().toCharArray();
                            Arrays.sort(ch);
                            return new String(ch);
                        },
                        LinkedHashMap::new,
                        Collectors.toList()))
                .values()
                .stream()
                .map(list2-> list2.get(0))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
