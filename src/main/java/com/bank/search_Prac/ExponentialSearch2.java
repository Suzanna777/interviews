package com.bank.search_Prac;

public class ExponentialSearch2 {

    public static int exponentialSearch2(int[]arr, int data){
        int boundData = 1;
        while (boundData<arr.length && arr[boundData]<data) boundData*=2;
        int left = boundData/2;
        int right=Math.min(boundData, arr.length-1);
        return BinarySear2.binarySearRecursive2(arr, data,left,right);

    }


}
