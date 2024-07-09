package com.bank.search_Prac;

public class Linear_Search2 {
    public static int linearSearch(int[] arr, int data){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==data)return i;
        }
        return -1;
    }

}
