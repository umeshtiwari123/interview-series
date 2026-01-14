package com.wipro;


import java.util.*;
import java.util.stream.*;
public class LatestInterview {

        /*
        Write a program.
    number is from 1 to 100.
    If number which is odd than multiply it by 2.
    and print all the numbers.

        */
        public static void main(String[] args) {
            IntStream.rangeClosed(1,100)
                    .map(n->(n%2!=0)?n*2:n)
                    .forEach(System.out::println);
        }

}
