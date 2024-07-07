package com.bank.dsa_06_AlgorithmProblems.AlgorithmProblemReview.ReverseLinkedListLeetCode;

public class solution {
    public static void main(String[] args) {
      ListNode head=new ListNode(1);
      ListNode node2= new ListNode(2);
      head.next=node2;
        ListNode node3= new ListNode(3);
        node2.next=node3;
     reverseList(head);

    }
    public static ListNode reverseList(ListNode head) {
        // Create two pointers
        if(head==null || head.next==null) return head;

        ListNode prev=head;
        ListNode current=head.next;
        // while loop to iterate until curr=null
        while (current!=null){
            ListNode nextNode=current.next;
            current.next=prev;//change direction of current to prev
            prev=current; // move prev to right to the current
            current=nextNode; // move current to right on the next node
        }
        // now adjust tail and head

        head.next=null;
        return prev;// return prev as head
    }
}
