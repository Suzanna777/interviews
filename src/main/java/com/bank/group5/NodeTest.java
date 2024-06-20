package com.bank.group5;

public class NodeTest {
    public static void main(String[] args) {

        MyLNode node = new MyLNode();
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13};
        for (int i = 0; i < numbers.length; i++) {
            node.insert(numbers[i]);
        }

        System.out.println("before ");
        node.print(node.head);

        int m = 2;
        int n = 3;

        node.deleteNode(node.head, m, n);

        System.out.println("after :");
        node.print(node.head);
    }
}
