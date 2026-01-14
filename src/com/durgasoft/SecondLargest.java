package com.durgasoft;

public class SecondLargest {

    public static void main(String[] args) {

        int[] arr1 = {1, 21, 17, 29, 51};
        System.out.println(getSecondLargest(arr1));

    }

    static int getSecondLargest(int[] arr){
        int n = arr.length;
        int largest = -1, secondLargest = -1;
        for (int i=0; i<n; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

}
