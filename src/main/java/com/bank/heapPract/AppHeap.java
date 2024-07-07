package com.bank.heapPract;

public class AppHeap {
    public static void main(String[] args) {
        HeapMy heap = new HeapMy(10);
        heap.insert(61);
        heap.insert(120);
        heap.insert(52);
        heap.insert(45);
        heap.insert(81);

        heap.printHeap();
        System.out.println();
        System.out.println(heap.remove());

        System.out.println("Heap data after removing 120");
        heap.printHeap();

    }
}
