package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {

        // Test cases
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "";

        System.out.println("Input: " + s1);
        System.out.println("Output: " + lengthOfLongestSubstring(s1));

        System.out.println("\nInput: " + s2);
        System.out.println("Output: " + lengthOfLongestSubstring(s2));

        System.out.println("\nInput: " + s3);
        System.out.println("Output: " + lengthOfLongestSubstring(s3));

        System.out.println("\nInput: \"" + s4 + "\"");
        System.out.println("Output: " + lengthOfLongestSubstring(s4));
    }
}
