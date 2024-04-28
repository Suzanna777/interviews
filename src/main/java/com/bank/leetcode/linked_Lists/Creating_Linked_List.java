package com.bank.leetcode.linked_Lists;

public class Creating_Linked_List {

    class Node{
        Node next = null;
        int data;
        public Node(int d){
            data = d;
        }
        void appendToTail(int d){
            Node end = new Node(d);
            Node n = this;
            while (n.next != null){
                n = n.next;
            }
            n.next = end;
        }
    }

}
