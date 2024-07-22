package com.bank.leetCodePrac;

import com.bank.reverseList.MyNode;
import com.bank.reverseList.MySingleList;

public class AddTwoNumbers {

    MyListNode addTwoNumbers(MyListNode list1, MyListNode list2) {
        // Input: l1 = [2,4,3], l2 = [5,6,4]
        //Output: [7,0,8]
        //Explanation: 342 + 465 = 807.
        MyListNode node = new MyListNode(0);
        MyListNode current = node;
        MyListNode previous = node;
        int temp = 0;
        return null;
    }


    public MyListNode addTwoNumbers2(MyListNode L1, MyListNode L2) {
        MyListNode node = new MyListNode(0);
        MyListNode curr = node;
        int temp = 0;
        MyListNode pL1 = L1;
        MyListNode pL2 = L2;

        while (pL1 != null && pL2 != null) {
            int sum = temp;

            if (pL1 != null) {
                sum += pL1.value;
                pL1 = pL1.next;
            }
            if (pL2 != null) {
                sum += pL2.value;
                pL2 = pL2.next;
            }
            temp = sum / 10;
            curr.next = new MyListNode(sum % 10);
            curr = curr.next;
        }
        if (temp > 0) {
            curr.next = new MyListNode(temp);
        }
        return node.next;
    }


    /*Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [7,0,8]
   Explanation: 342 + 465 = 807.
    MyListNode head = new MyListNode();
        MyListNode prev = L1.head;
        MyListNode curr = L1.head.next;

          Node prev=list.head;
         Node current=list.head.next;
         // while loop to iterate until curr=null
         while (current!=null){
             Node nextNode=current.next;
             current.next=prev;//change direction of current to prev
             prev=current; // move prev to right to the current
             current=nextNode; // move current to right on the next node
         }

         // now adjust tail and head
         list.tail=list.head;
         list.tail.next=null;
         list.head=prev;


    head = tail
    tail
    t = t .next
    t = previous
       Output: [7,0,8]
     Explanation: 342 + 465 = 807.*/
}
