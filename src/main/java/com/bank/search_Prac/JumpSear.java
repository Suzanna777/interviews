package com.bank.search_Prac;

public class JumpSear {
    public static void main(String[] args) {
        int[] numbers=new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i]=i;
        }
        System.out.println(jumpSearch(numbers, 6));
    }
    public static int jumpSearch(int[]arr, int data){
        int blockSize = (int)Math.sqrt(arr.length);
        int start =0;
        int next=blockSize;
        while (start<arr.length&&arr[next-1]<data){
            start=next;
            next+=blockSize;
            if (next>arr.length)next=arr.length;
        }
        for (int i = start; i < next; i++) {
            if (arr[i]==data)return i;
        }
        return -1;

    }
}
