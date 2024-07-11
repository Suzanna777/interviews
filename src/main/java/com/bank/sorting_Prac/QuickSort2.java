package com.bank.sorting_Prac;

import java.util.Arrays;

public class QuickSort2 {
    public static void main(String[] args) {
        int[]numbers = {7,-1,3,5,2};
        qS(numbers,0,numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }

    // Data?
    //i	  i    i 	  i	   i
    //S				       E   1)
    //B++      swab	     [ Pivot]

    public static void qS(int[]arr, int start, int end){
        if (start>=end)return;
        int boundary = partition(arr, start, end);
        qS(arr,boundary+1,end);
        qS(arr,start,end-1);
    }
    public static int partition(int[]arr, int start, int end){
        int piviot = arr[end];
        int boundary = start;
        for (int i = start; i <=end ; i++) {
            if (arr[i] <=piviot)swab(arr,i,boundary++);
        }
        return boundary-1;
    }
    public static void swab(int[]arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }






}
