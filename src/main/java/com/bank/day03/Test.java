package com.bank.day03;

public class Test {
    public static void main(String[] args) {
    MySinglyList list = new MySinglyList();
        list.addNode(new MyNode(11));
        list.addNode(new MyNode(3));
        list.addNode(new MyNode(10));
        list.addNode(new MyNode(12));

        list.printNode();
        list.findIndex(3);
        list.get(2);

        }



}
