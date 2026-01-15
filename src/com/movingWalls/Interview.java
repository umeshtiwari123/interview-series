package com.movingWalls;

public class Interview {
    /*
    *
    * Hi Manisha,

Please find the solutions below :

Q1.
Given two strings s and t, return true if the two strings are anagrams of each other; otherwise return false.
An anagram is a string that contains the exact same characters as another string, but the order of characters can be different.

Solution to Q1:

import java.util.*;
class Main {

    public static boolean isAnagram(String s, String t){
        if(s== null || t== null || s.length() != t.length()){
        return false;
        }
        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int c: count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Words are listen and silent : "+isAnagram("listen","silent"));
        System.out.println("Words are abc and def : "+isAnagram("abc","def"));
    }
}


Q2.
Given an integer array nums, return true if any value appears more than once in the array; otherwise return false.

Solution to Q2:

import java.util.*;
class Main {

    public static boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();

        for(int num :nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {1,2,3,1};

        System.out.println("nums1[] result is "+containsDuplicate(nums1));
        System.out.println("nums2[] result is "+containsDuplicate(nums2));
    }
}

Thanks & Regards,
Umesh Tiwari

    * */
}
