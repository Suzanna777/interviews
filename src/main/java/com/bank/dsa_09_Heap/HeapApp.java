package com.bank.dsa_09_Heap;

public class HeapApp {
    public static void main(String[] args) {
//        MyHeap heap=new MyHeap(10);
//        heap.insert(61);
//        heap.insert(120);
//        heap.insert(52);
//        heap.insert(45);
//        heap.insert(81);
//        heap.printHeap();
//        heap.remove();
//        heap.printHeap();
//        heap.insert(130);
//        heap.printHeap();
//        heap.remove();
//        heap.printHeap();

        int[] numbers={1,2,5,6,8,21,0};
        MyHeap heap2 = new MyHeap(numbers);
        heap2.printHeap();
    }

}
