package com.cognizantLaptopCode;

public class LeftRotateByDElements {

    static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateLeftByDElements(int[] arr, int n, int k){
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        rotateLeftByDElements(arr, 7,1);

        for(int res: arr){
            System.out.println(res+ " ");
        }
    }
}
