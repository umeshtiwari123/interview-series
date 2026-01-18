package com.cognizantLaptopCode.javaTechie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ZerosAndOnes {

    public static void main(String[] args) {
        int[] arr = {0,5,6,0,2,3,0,0,0};

        List<Integer> result = Arrays.stream(arr)
                .boxed().collect(Collectors.toList());

        List<Integer> resultOutput = result.stream()
                .sorted().collect(Collectors.toList());

        System.out.println(resultOutput);
    }
}
