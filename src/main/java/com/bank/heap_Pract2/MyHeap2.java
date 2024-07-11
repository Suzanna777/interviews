package com.bank.heap_Pract2;

import java.util.NoSuchElementException;

public class MyHeap2 {
    int[]arr;
    int indexValue; // size is index value

    public MyHeap2(int capacity) {
        this.arr = new int[capacity];
        this.indexValue = 0;
    }
    public int peek(){
        if (indexValue==0)throw new NoSuchElementException();
        return arr[0];
    }
    public void insert(int data){
        if (indexValue==arr.length)throw new IllegalStateException();
        else {
            arr[indexValue++]=data;
            bubbleUp();
        }
    }


    public void bubbleUp(){
        int index = indexValue-1;
        while (index > 0 && arr[index] > arr[headIndex(index)]){
            swab(index, headIndex(index)); index=headIndex(index);
        }
    }


    public void swab(int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] =arr[idx2];
        arr[idx2] = temp;
    }
    public static int  leftChildIndex(int index){
        return index * 2 + 1;
    }
    public static int rightChildIndex(int index){
        return index * 2 +2;

    }
    public static int headIndex(int index){
        return (index-1)/2;
    }
    public boolean hasLeftChild(int index){
        return leftChildIndex(index) < indexValue;
    }
    public boolean hasRightChild(int index){
       return rightChildIndex(index) < indexValue;
    }
    public boolean isValidHead(int index){
        if (!hasLeftChild(index)) return true;
        else {
            boolean isValid = (arr[index] >= arr[leftChildIndex(index)]);
            if (hasLeftChild(index)) {
                isValid = (arr[index] >= arr[leftChildIndex(index)] && arr[index]>=arr[rightChildIndex(index)]);
            }
            return isValid;
        }

    }

    public int largestChildIndex(int index){
        if (!hasLeftChild(index)) return index;
        else if (!hasRightChild(index)){
            return leftChildIndex(index);
        }
        return arr[leftChildIndex(index)]>arr[rightChildIndex(index)] ? leftChildIndex(index) : rightChildIndex(index);
    }
    public void printHead(){
        for (int i = 0; i < indexValue ; i++) {
            System.out.print(arr[i] + " => ");

        }
    }

}
