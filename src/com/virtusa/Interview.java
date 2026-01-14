package com.virtusa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Interview {

    /*Given an array of strings strs, group the anagrams together. You can return the answer in any order.

    Two strings are anagrams if they contain the same characters but rearranged.

            Input: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
    Output: [["eat","tea","ate"],["tan","nat"],["bat"]]*/

    public static void main(String[] args) {

        List<String> strs = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

        Map<String, List<String>> result = strs.stream()
                .collect(Collectors.groupingBy(s -> {
                    char[] ch = s.toCharArray();
                    Arrays.sort(ch);
                    return new String(ch);
                }));

/*
        "eat" -> ['e' , 'a', 't']
        "tea" -> ['t', 'e', 'a']
        "tan" -> ['t', 'a', 'n']
 */
        System.out.println(new ArrayList<>(result.values()));

    }
}