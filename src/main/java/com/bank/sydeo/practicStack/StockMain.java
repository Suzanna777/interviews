package com.bank.sydeo.practicStack;

public class StockMain {
    public static void main(String[] args) {
        MyStack<Integer> node = new MyStack<>();
        for (int i = 0; i < 5; i++) {
            node.push(i);
        }
        node.push(10);
        for (int i = 0; i < 5; i++) {
            System.out.println(node.peek());
        }
        System.out.println(node.peek());
    }
}
