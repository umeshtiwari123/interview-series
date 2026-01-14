package com.StringsDSA;

public class ReverseTheString {

    public static String reverseString(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }


    public static void main(String[] args) {
        String input1 = "GeeksforGeeks";
        String input2 = "abcdefg";
        System.out.println(reverseString(input1));
        System.out.println(reverseString(input2));
    }
}
