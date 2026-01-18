package com.cognizantLaptopCode;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    static void characterCountOfString(String input){

        HashMap<Character, Integer> countMap = new HashMap<>();

        char[] strArray = input.toCharArray();

        for(char c : strArray){
            if(countMap.containsKey(c)){
                countMap.put(c, countMap.get(c)+1);
            }else{
                countMap.put(c,1);
            }
        }

        for(Map.Entry entry : countMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        String input  = "mississippi";

        characterCountOfString(input);;
    }

}
