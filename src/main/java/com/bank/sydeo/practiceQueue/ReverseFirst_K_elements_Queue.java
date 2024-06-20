package com.bank.sydeo.practiceQueue;

import java.util.Stack;

public class ReverseFirst_K_elements_Queue {
    public static void main(String[] args) {

        MyQueueSydeo<Integer> queue = new MyQueueSydeo<>();

        for (int i = 0; i < 6; i++) {
            queue.enqueue(i);
        }
        System.out.println();
        System.out.print(" before reverse element ");

        queue.printQueue();
        System.out.println();
        System.out.print(" queue after ");
        System.out.println();
        reverseFirst(queue,3).printQueue();

    }

    static MyQueueSydeo<Integer> reverseFirst(MyQueueSydeo<Integer> queue, int k) {
        // create stack
        Stack<Integer> stack = new Stack<>();

        // iterate and push first element into stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.dequeue());
        }
        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }
        for (int i = 0; i < queue.size-k; i++) {
            queue.enqueue(queue.dequeue());
        }
        return queue;
    }

}
/*
*      Given an integer K and queue of integers,
*      write code to reverse the order of the first K elements
*      of the queue.
     TEXT Input: Q=[10,20,30,40,50],K=4 -
   * Pattern Output: Q = [40,30, 20, 10, 50]*/