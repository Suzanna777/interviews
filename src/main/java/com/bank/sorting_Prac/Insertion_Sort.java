package com.bank.sorting_Prac;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] number = {7,2,4,6,1,9,-1};
        System.out.println(Arrays.toString(insertionSort(number)));
    }
    public static int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
          int toBeInserted = arr[i];
          int j = i-1;
          while (j>=0 && toBeInserted<arr[j]){
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=toBeInserted;
        }
        return arr;
    }
}
