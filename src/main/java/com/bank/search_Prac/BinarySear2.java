package com.bank.search_Prac;

public class BinarySear2 {
    public static int binarySearIteration(int[]arr, int data){
        int left = 0;
        int right = arr.length-1;
        while (right<=left){
            int mid = (left+right)/2;
            if(arr[mid]==data) return mid
            if(data<arr[mid]) right =mid-1; // L  M D> R
            else left=mid+1;//
        }
        return -1;
    }

    public static int binarySearRecursive2(int[]arr, int data){
        return binarySearRecursive2(arr, data, 0, arr.length-1);
    }
    public static int binarySearRecursive2(int[]arr, int data, int left, int right){
        // > calc, ==, < , else
       if (left>right) return -1;
       int mid = (left+ right)/2;
       if (arr[mid]==data) return mid;
       if (data<arr[mid])return binarySearRecursive2(arr, data,left, mid-1);// L D < M
        else return binarySearRecursive2(arr, data, mid+1, right); //  M > D R
    }
}
