package com.bank.sorting_Prac;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] numbers ={7,2,4,6,1,9,-1};
        System.out.println(Arrays.toString(bubbleSort(numbers)));
    }
    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swap=false;
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    swap=true;
                }
            }
            if (!swap)return arr;
        }
        return arr;
    }


    public static void swap(int[]arr, int idx1, int idx2){
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }


}
