package com.bank.sydeo.pract.node2;

public class MySinglyList {
    SNode head;
    SNode tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void insert(int data) {
        // 1. create a new node object from data
        SNode node = new SNode(data);
        // 2.
        if (isEmpty()) {
            head = tail = node;
            size++;
        } else {
            tail.next = node;
            tail = node;
            size++;
        }

    }

    void deleteByData(int data) {
        if (isEmpty()) System.out.print(" list is empty ");
        // assign prev and current withe head
        SNode previous = head;
        SNode current = head;
        while (current != null) {
            if (current.data == data) {
                // case 1: head
                if (current == head) {
                    head = current.next;
                    current.next = null;
                }
                // case 2: tail
                else if (current == tail) {
                    tail = previous;
                    previous.next = null;
                }
                // case 3: middle
                else {
                    previous.next = current.next;
                    current.next = null;
                }
                size--;
                // after deletion
            }
            previous = current;
            current = current.next;
        }
    }


    void printNodes() {
        SNode current = head;
        while (current != null) {
            if (current.next == null) System.out.println(" current data " + current.data);
            else {
                System.out.print(current.data + " => ");
            }
            current = current.next;
        }
    }

    int indexOf(int data) {
        if (isEmpty()) return -1;
        int position = 0;
        // iterate the list
        SNode current = head;
        while (current != null) {
            if (current.data == data) return position;
            position++;
            current = current.next;
        }
        return -1;
    }
}
