package com.bank.leetCodePrac;

public class ReverseList {

    public MyListNode reverseList(MyListNode head) {
        MyListNode node = null;
        int size = 0;
        while (head != null) {
            MyListNode tail = head;
            head = head.next;
            tail.next = node;
            node = tail;
            size++;
        }
        return node;
    }

}

