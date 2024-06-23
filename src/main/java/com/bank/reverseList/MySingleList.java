package com.bank.reverseList;

public class MySingleList {
    MyNode head;
    MyNode tail;
    int size;

    MySingleList() {
    }

    MySingleList addTwoNumbers(MyNode list1, MyNode list2) {
        // Input: l1 = [2,4,3], l2 = [5,6,4]
        //Output: [7,0,8]
        //Explanation: 342 + 465 = 807.
        MyNode node = new MyNode(0);
        MyNode current = node;
        MyNode previous = node;
        int temp = 0;
        return null;
    }

    public static MyNode reverseList(MyNode head) {
        if (head == null || head.next == null) return head;
        MyNode previous = head;
        MyNode current = head.next;
        while (current != null) {
            MyNode node = current.next;
            current.next = previous;
            previous = current;
            current = node;
        }
        head.next = null;
        return previous;
    }

}
