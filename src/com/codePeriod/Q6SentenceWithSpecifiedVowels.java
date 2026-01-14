package com.codePeriod;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Q6SentenceWithSpecifiedVowels {

    public static void main(String[] args) {

        String str = " I am learning Streams API in Java";

        Arrays.stream(str.split(" "))
                .filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==2)
                .forEach(System.out::println);

        System.out.println("===============");
        Arrays.stream(str.split(" "))
                .filter(word->word.toLowerCase()
                        .chars()
                        .filter(c->"aeiou".indexOf(c)!= -1)
                        .count()==2
                )
                .forEach(System.out::println);

        System.out.println("--------------");
        Arrays.stream(str.split(" "))
                .filter(word -> word.toLowerCase()
                        .chars().filter(c->"aeiou".indexOf(c)!=-1)
                        .count() ==2)
                .forEach(System.out::println);
    }
}
