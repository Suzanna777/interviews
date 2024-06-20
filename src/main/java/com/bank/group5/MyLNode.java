package com.bank.group5;

public class MyLNode {

    LNode head;

  public MyLNode() {
    this.head = null;
  }

    //  insert a new node at the end of the list
     void insert(int data) {
        LNode newNode = new LNode(data);
        if (head == null) {
            head = newNode;
        } else {
            LNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    //  delete n nodes after m nodes
    void deleteNode(LNode head, int m, int n) {
        LNode current = head;
        LNode previous = null;

        while (current != null) {
            // Keep the first m nodes
            for (int i = 0; i < m && current != null; i++) {
                previous = current;
                current = current.next;
            }

            // Remove the next n nodes
            for (int j = 0; j < n && current != null; j++) {
                current = current.next;
            }

            // Connect the last node of the kept part to the next node after the removed part
            if (previous != null) {
                previous.next = current;
            }
        }
    }

    //  print the list
     void print(LNode head) {
        LNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}