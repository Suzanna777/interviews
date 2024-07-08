package com.bank.search_Prac;

import java.util.Arrays;

public class BinarySear {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] =i;}
        System.out.print(Arrays.toString(numbers));

        System.out.println();

        System.out.println(binarySearIterative(numbers, 6));
    }

    public static int binarySearIterative(int[] array, int data){
        int left=0;
        int right = array.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (array[mid]==data) return mid;
            if (data<array[mid]) right=mid-1;
            else left=mid+1;
        }
        return -1;

    }
    public static int binarySearRecursive(int[] array, int data){
        return binarySearRecursive(array, data, 0,  array.length-1);
    }
    public static int binarySearRecursive(int[] array, int data, int left, int right){
       if (left>right)return -1;

        int mid = (right+left)/2;
        if (array[mid]==data)return mid;
        if (data<array[mid]) return binarySearRecursive(array, data, left, mid-1);
        else return binarySearRecursive(array, data,mid+1, right); // L M R if D on the R side then L = M+1 R
    }
}
