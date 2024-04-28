package com.bank.node;

class DoublyListNode {
    int value;  // value
    DoublyListNode next; //  next
    DoublyListNode prev; //  previous
    DoublyListNode(int value){ // const create new value
        this.value = value;
    }
}
 public class AddTwoNumbersDoublyLinkedList {
   // static method TC return addMethod(from TC l1, TC l2)
    public static DoublyListNode addTwoNumbers(DoublyListNode l1, DoublyListNode l2){
        // 1. TC start answer from Head with new double list nodes with value 0
        DoublyListNode dummyHead = new DoublyListNode(0);

        // 2. TC Pointer current takes value of Head to build an answer-linked list
        DoublyListNode current = dummyHead;
        // 3. carry digits from previous to next number
        int carry = 0;

        // 4. Keep going while until we reach the end of both linked lists l1, l2, and there's no carry left
        while (l1 != null || l2 != null || carry != 0){
            // Start with the carry from the previous sum(l1, l2 added and carry holding the value degit)
            int sum = carry;

            // Add the digits from each linked list, if available != null, sum + l1.val, l1.next
            if(l1 != null){
                sum += l1.value;
                l1 = l1.next;
            }
            if (l2 != null){
                sum += l2.value;
                l2 = l2.next;
            }
            // If the sum is 10 or more, we need to carry over digit (first hundreds or thousand / 10)
            carry = sum / 10;

            // Write down the last digit of the sum on our answer linked list
            // cur, nex = new CT value
            current.next = new DoublyListNode(sum% 10);
            // reference cur, nex, prev, = cur
            current.next.prev = current;
            current= current.next;

        }
        // ret head, next
        return dummyHead.next;
    }
}

