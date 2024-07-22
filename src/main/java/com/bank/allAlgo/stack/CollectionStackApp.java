package com.bank.allAlgo.stack;

import java.util.Deque;
import java.util.LinkedList;

public class CollectionStackApp {
    public static void main(String[] args) {
        Deque<Integer> dequeStack = new LinkedList<>();
        dequeStack.push(1);
        dequeStack.push(2);
        dequeStack.push(3);

        System.out.println(dequeStack.peek() + " return value of tail/top");
        System.out.println(dequeStack.pop() + " Remove value of tail/top");

        System.out.println(dequeStack.peek() + " return value of tail/top");
    }
}
