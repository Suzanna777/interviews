package com.bank.day_06AlgoPro.ReverseLinkedList;

public class Solution {
    public static void main(String[] args) {
        MySinglyLinkedList list=new MySinglyLinkedList();

        for(int i=0;i<10;i++) list.add(i);
        list.printNodes();
        System.out.println("After reverse in one pass");
        reverse(list);
        list.printNodes();
    }
     static void reverse(MySinglyLinkedList list) {
         Node previous = list.head;
         Node current = list.head.next;

         // N P=H; N C=H.next; while(C!=null){N nextN=C.next; C.next=P; P=C; C=nextN }
         // T=H; T.next=null; H=P
         while (current!=null){
             Node nextN=current.next;
             current.next=previous;
             previous=current;
             current=nextN;
         }


         list.tail=list.head;
         list.tail.next=null;
         list.head=previous;

         }




    }

