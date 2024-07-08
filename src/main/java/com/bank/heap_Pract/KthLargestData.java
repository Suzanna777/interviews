package com.bank.heap_Pract;

public class KthLargestData {
    public static void main(String[] args) {
        int[] numbers={3,2,1,5,6,4};
        System.out.println(getKthLargestNumber(numbers, 2));
    }

    public static int getKthLargestNumber(int[] array, int kData){
        // 1. create heap
        HeapMy heap = new HeapMy(array.length);
        // 2. put an array into a heap
        for (int i = 0; i < array.length; i++) {
            heap.insert(array[i]);
        }
        // 3. remove root K-1 time
        for (int i = 0; i < kData-1; i++) {
            heap.remove();
        }
        // 4. return roots
        return heap.peek();
    }
    // 1. create heap
    // 2. put an array into a heap
    // 3. remove root K-1 time
    // 4. return root
}
