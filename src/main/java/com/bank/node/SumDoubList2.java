package com.bank.node;

class DoubleNode{
    int value;
    DoubleNode next;
    DoubleNode previous;

    DoubleNode(int value){
        this.value = value;
    }
}
public class SumDoubList2 {
    public static DoubleNode addNode(DoubleNode l1, DoubleNode l2) {
        DoubleNode head = new DoubleNode(0); // start head in value 0
        DoubleNode current = head; // head, current, carry
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0){
            int sum = carry;
            if (l1 != null){
                sum += l1.value;
                l1 = l1.next;
            }
            if (l2 != null){
                sum += l2.value;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new DoubleNode(sum % 10);
            current.next.previous = current;
            current = current.next;
        }
        return head.next;
    }
}
