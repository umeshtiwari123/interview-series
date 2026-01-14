package com.CitiusTech;

import java.util.stream.Stream;

public class Program1 {

    public static void main(String[] args) {

        Stream<Integer> s = Stream.of(10,8,15,40,23,35);

        s.filter(e->e<20).forEach(System.out::println);

        System.out.println("--------------------------------");
        Stream<Integer> s1 = Stream.of(10,8,15,40,23,35);

        s1.filter(e->e>20).forEach(System.out::println);
//        s.filter(e->e>20).forEach(System.out::println);

        /*
        The above code will throw the Runtime Exception java.lang.IllegalStateException :
        stating the stream has already been operated upon or closed
         */
    }
}
