package com.bank.heap_Pract;

import java.util.NoSuchElementException;

public class HeapMy {
    int[] items;
    int size;

    public HeapMy(int capacity) {
        this.items = new int[capacity];
        this.size = 0;
    }

    public int peek() {
        if (size == 0) throw new NoSuchElementException();
        return items[0];
    }

    // insert
    public void insert(int data) {
        if (size == items.length) throw new IllegalStateException();
        else {
            items[size++] = data;
            bubbleUp();
        }
    }

    public void bubbleUp() {
        int index = size - 1;
        while (index > 0 && items[index] > items[headIndex(index)]) {
            swap(index, headIndex(index));
            index = headIndex(index);
        }
    }

    public int remove() {
        if (size == 0) throw new NoSuchElementException();
        else {
            int result = items[0];
            items[0] = items[--size];
            bubbleDown();
            return result;
        }
    }


    public void bubbleDown() {
        int index = 0;
        int LargestChildIndex;
        while (index <= size && !isValidHead(index)) {
            LargestChildIndex = LargestChildIndex(index);
            swap(index, LargestChildIndex);
            index = LargestChildIndex;
        }
    }

    public boolean isValidHead(int index) {
        if (!hasLeftChild(index)) return true;
        else {
            boolean isValid = (items[index] >= items[leftChildIndex(index)]);
            if (hasRightChild(index)) {
                isValid = (items[index] >= items[leftChildIndex(index)] && items[index] >= items[rightChildIndex(index)]);
            }
            return isValid;
        }
    }

    // swab
    public void swap(int first, int second) {
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    public int headIndex(int index) {
        return (index - 1) / 2;
    }

    public boolean hasLeftChild(int index) {
        return leftChildIndex(index) < size;
    }

    public boolean hasRightChild(int index) {
        return rightChildIndex(index) < size;
    }

    public int leftChildIndex(int index) {
        return index * 2 + 1;
    }

    public int rightChildIndex(int index) {
        return index * 2 + 2;
    }

    public int LargestChildIndex(int index) {
        if (!hasLeftChild(index)) return index;
        else if (!hasRightChild(index)) {
            return leftChildIndex(index);
        }
        return items[leftChildIndex(index)] > items[rightChildIndex(index)]
                ? leftChildIndex(index) : rightChildIndex(index);
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(items[i] + "=> ");
        }
    }


}
