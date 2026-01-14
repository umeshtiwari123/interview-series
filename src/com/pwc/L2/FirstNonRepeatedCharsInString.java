package com.pwc.L2;

import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class FirstNonRepeatedCharsInString {

    public static void main(String[] args) {

        String str = "swiss";

        char res = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap:: new, Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue()>=1)
                .map(Map.Entry::getKey)
                .findFirst().get();

        System.out.println(res);
    }
}
