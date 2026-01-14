package com.solventum;

public class Interview {

    /*
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
Return true if two strings are anagrams (same letters, same counts).
Examples: "listen","silent" → true; "rat","car" → false
*/
/*import java.util.*;
    class Main {

        public static boolean isAnagram(String s1, String s2){
            if(s1.length() != s2.length()){
                return false;
            }

            int[] count = new int[256];

            for(int i=0;i<s1.length();i++){
                count[s1.charAt(i)]++;
                count[s2.charAt(i)]--;
            }

            for(int c: count){
                if(c!=0){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            System.out.println(isAnagram("listen","silent"));
            System.out.println(isAnagram("rat","car"));
        }
    }
     */
}
