package com.bank.sydeo.queueCollection;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    QNode<T> front;
    QNode<T> back;
    int size;

    public MyQueue() {

    }

    // if front is empty
    boolean isEmpty() {
        return front == null;
    }

    void enqueue(T item) {
        QNode<T> node = new QNode<>(item);
        if (isEmpty()) front = back = node;
        else {
            back.next = node;
            back = node;
        }
        size++;
    }

    T dequeue() {
        QNode<T> frontNode;
        if (isEmpty()) throw new NoSuchElementException();
        if (front == back) {
            frontNode = front;
            front = front = null;
        } else {
            frontNode = front;
            front = front.next;
        }
        size--;
        return frontNode.value;
    }

    // peek return value
    T peek() {
        return front.value;
    }

    // size return
    int size() {
        return size;
    }

}
