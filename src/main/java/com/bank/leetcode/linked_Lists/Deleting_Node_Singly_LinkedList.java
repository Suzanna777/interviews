package com.bank.leetcode.linked_Lists;

import org.w3c.dom.Node;

/*  Deleting a Node from a Singly Linked List
   Deleting a node from a linked list is fairly straightforward.
   Given a node n, we find the previous node
   prev and set prev.
   next equal to n. next.
   If the list is doubly linked,
   we must also update n. next to set n. next.
   prev equal to n. prev.
   The important things to remember are (1) to check for the null pointer
   and (2) to update the head
   or tail pointer as necessary.*/
public class Deleting_Node_Singly_LinkedList {

    class Node{
        Node next = null;
        int data;
        public Node(int d){
            data = d;
        }

    }
    Node deleteNode(Node head, int d){
        Node n = head;
        if (n.data == d){
            return head.next;
        }
        while (n.next != null){
            if (n.next.data == d){
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }
}
