package com.bank.day_06AlgoPro.MergeTwoSortedLL;

public class Solution {
    public ListNode mergeTwoLists(ListNode curr1, ListNode curr2) {
        // N HT = new N; N P = H;
        //while(C1 !=null && C2 != null){
        // if(C1.D <=C2.D){ P.next = C1; C1=C1.next }
        //Else{ P.next =C2; C2 =C2.next; }  P=P.next }
        //if(C1==null) P.next=C2; else P.next=C1;
        // return H.next
        ListNode headT = new ListNode();
        ListNode previous = headT;
        while (curr1 !=null && curr2!= null){
          if (curr1.data <=curr2.data) {
              previous.next=curr1;
              curr1=curr1.next;
          }
          else {
              previous.next=curr2;
              curr2.next=curr2;
          }
          previous=previous.next;
        }
        if (curr1==null){
            previous.next= curr2;
        }
        else {
            previous.next=curr1;
        }
        return headT.next;
    }
}
