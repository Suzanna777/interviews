package com.bank.sorting_Prac;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
       int[]numbers = {7,2,4,6,1,9,-1};
       quickSort(numbers,0,numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }
    public static void quickSort(int[] arr, int start, int end){
       // intro terminate if no element between start end, boundary index,
        if (start>=end)return;
        int boundary = partition1(arr,start,end);
        quickSort(arr,start,end-1);
        quickSort(arr, boundary+1,end);
    }

    public static int partition1(int[] arr, int start, int end){
        // intro: pivot at the end of arr, boundary index on the start
        int pivot =arr[end];
        int boundary = start;

        // IRAC
        for (int i = start; i <= end; i++) {
            if (arr[i]<=pivot)swap1(arr, i, boundary++);
        }
        return boundary-1;
    }

    public static void swap1(int[]arr, int ind1, int ind2){
        // IRAC T 1 ; 1 = 2; 2 = T
        int temp = arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }
}
