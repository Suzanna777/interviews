package com.bank.sydeo;

public class MySinglyLinkedList {

    SuzNode head;
    SuzNode tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        // create new suznode obj and add the data
        SuzNode suznode = new SuzNode(data);
        if (isEmpty()) { // if a list is empty
            head = tail = suznode;
            size++;
        } else { // if a list has an element
            tail.next = suznode;
            tail = suznode;
            size++;
        }
    }

    void printSuzNode(){
        SuzNode current = head;
        while (current!= null){
            if (current.next==null) System.out.println(current.id + " => null ");
            else {
            System.out.println(current.id + " => " );
            }
            current = current.next;

        }
    }

}
