package com.bank.dsa_05_Stacks.StacksReview;

public class MySinglyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    T removeFirst() {
        // if stack is empty return null
        if (isEmpty()) return null;
        // assign result null;
        T result = null;
        // case1 : 1 element in list (head = tail)
        if (head == tail) {
            result = head.value;
            head = tail = null;
        }
        // case 2: more than 1 element
        else {
            result = head.value;
            head = head.next;
        }
        size--;
        return result;

    }

    void addFirst(T data) {
        // create a new node object from data
        Node<T> node = new Node(data);
        // case 1: list empty
        if (isEmpty()) {
            head = tail = node;
        } else {// case 2 : list is not empty
            node.next = head;
            head = node;
        }
        //increase size
        size++;
    }

    void add(T data) {
        // create a new node object from data
        Node<T> node = new Node(data);

        if (isEmpty()) { // if the list is empty
            head = tail = node;
            size++;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }

    }

    void printNodes() {
        Node<T> current = head;
        while (current != null) {
            if (current.next == null) System.out.println(current.value + "=> null");
            else {
                System.out.print(current.value + "=> ");
            }
            current = current.next;
        }
    }
}