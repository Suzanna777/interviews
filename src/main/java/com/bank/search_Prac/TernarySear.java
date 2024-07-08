package com.bank.search_Prac;

public class TernarySear {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i]=i;
        }
        System.out.println(ternarySearIterative(numbers, 6));
        System.out.println(ternarySearRecursive(numbers, 6, 0, numbers.length-1));
    }
    public static int ternarySearIterative(int[] arr, int data) {
        int left = 0;
        int right = arr.length - 1;
        while (right >= left) {
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

    public static int ternarySearRecursive(int[] arr, int data, int left, int right) {
        if (left > right) return -1;

        // same as Iterative search copy from and past here
        // Partition calculation
        int partition = (right - left) / 3;


        // M1 and M2 calculation
        int mid1 = left + partition;
        int mid2 = right - partition;

        // [M1] == D or [M2] == D return M1 or M2
        if (arr[mid1] == data) return mid1;
        if (arr[mid2] == data) return mid2;

        // change this part for recursive
        if (data < arr[mid1]) return ternarySearRecursive(arr, data, left, mid1 - 1);
        else if (data > arr[mid2]) return ternarySearRecursive(arr, data, mid2 + 1, right);
        else return ternarySearRecursive(arr, data, mid1 + 1, mid2 - 1);
    }


}
