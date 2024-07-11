package com.bank.heap_Pract2;

public class AppMyHeap {
    public static void main(String[] args) {
        MyHeap2 heap = new MyHeap2(10);
        heap.insert(22);
        heap.insert(24);
        heap.insert(21);
        heap.insert(27);
        heap.insert(28);
        heap.insert(20);
        heap.printHead();

        System.out.println();

        heap.swab(0,3);
        System.out.println();
        heap.printHead();
    }
}
