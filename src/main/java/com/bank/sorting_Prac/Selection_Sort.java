package com.bank.sorting_Prac;

import java.util.Arrays;

public class Selection_Sort {

    public static void main(String[] args) {
        int[] numbers = {7,2,4,6,1,9,-1};
        System.out.println(Arrays.toString(selectionSort(numbers)));
    }
    public static int[]selectionSort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[minIndex]) minIndex=j;
            }
            swap(arr,minIndex,i);
        }
        return arr;
    }
    public static void swap(int[] arr, int idx1, int idx2){
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }

}
