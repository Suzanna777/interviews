package com.bank.leetcode.AlgorithmProblemLeetcode.ReverseLeetCodeLinkedList;

public class solution {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);

    }

    public static ListNode reverseList(ListNode head) {
        // Create two pointers
        if (head == null || head.next == null) return head;
        ListNode prev = head;
        ListNode current = head.next;
        // while loop to iterate until curr=null
        while (current != null) {
           ListNode nextNode = current.next;
            current.next = prev;//change direction of current to prev
            prev = current; // move prev to right to the current
            current = nextNode; // move current to right on the next node
        }
        // now adjust tail and head
        head.next = null;
        return prev;// return prev as head
    }
}


