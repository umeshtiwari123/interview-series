package com.practise;

public class RotateLeftByDPlaces {

    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7};
        int n = 7;
        int k = 3;
        rotateArrayLeft(arr,n,k);

        for(int res : arr){
            System.out.print(res + " ");
        }

    }

    static void reverse(int[] arr, int start, int end){

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateArrayLeft(int[] arr, int n , int k){

        reverse(arr, 0 , k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);

    }

}
