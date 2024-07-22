package com.bank.allAlgo.stack;

public class StackApp {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }

        // Push() - Add() from tail/top
       stack.push(10);
        System.out.println();

        for (int i = 0; i < 5; i++) {
            //Pop() - Remove tail/top
            System.out.print(stack.pop());
        }
    }
}
