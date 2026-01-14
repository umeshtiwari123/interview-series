package com.durgasoft;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OccurrenceCode {


    static void occurrenceOfEachChar(String input){

        LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<>();

        char[] strArray = input.toCharArray();

        for(char c : strArray){
            if(countMap.containsKey(c)){
                countMap.put(c, countMap.get(c)+1);
            }else{
                countMap.put(c, 1);
            }
        }

        for(Map.Entry entry : countMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


    }


    public static void main(String[] args) {
        String input = "helloworld";

        occurrenceOfEachChar(input);
    }
}
