package com.bank.search_Prac;

public class TernarySear2 {
    public static int ternarySear2(int[] arr, int data) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int partition = (right - left) / 3;
            int mid1 = left + partition;
            int mid2 = right - partition;
            if (arr[mid1] == data) return mid1;
            if (arr[mid2] == data) return mid2;

            if (data < arr[mid1]) right = mid1 - 1;
            else if (data > arr[mid2]) left = mid2 + 1;
            else {
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }
        return -1;
    }
}
