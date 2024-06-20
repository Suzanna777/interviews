package com.bank.sydeo.assignments;

public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int data) {
        Node node = new Node(data);
        // if empty
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

//    void addFirst(int data){
//      // New node
//      Node node = new Node(data);
//        // case 1: list empty then head = tail = node
//        if (isEmpty()){
//            head=tail=node;
//        }
//        //if a list is not empty, then next node address of the node would be a head
//        // and head is now new node
//        else {
//           node.next = head;
//           head=node;
//        }
//        size++;
//    }


    public int getKthItemFromLast(int k) {
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < k - 1; i++) {
            p2 = p1.next; // p2 would get address of next node
        }
        while (p2.next != null) { // p2 address next is not null
            p1 = p1.next; // p1 is p1 next address
            p2 = p2.next; // p2 is p2 next address
        }
        return p1.data;
    }


    public void removeKthItemFromLast(int k) {
        Node node1 = head;
        Node node2 = head;
        Node previous = null;
        // Head node > point1 = previous node >  next node > tail node
        for (int i = 0; i < k - 1; i++) {
            node2 = node2.next;
        }

        while (node2.next != null) {
            previous = node1;
            node1 = node1.next;
            node2 = node2.next;
        }
        if (node1 == head) {
            head = node1.next;
            node1.next = null;
            size--;

        } else if (node1 == tail) {
            tail = previous;
            previous.next = null;
            size--;
        } else {
            previous.next = node1.next;
            node1.next = null;
            size--;
        }
    }


}
