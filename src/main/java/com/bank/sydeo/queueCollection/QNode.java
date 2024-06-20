package com.bank.sydeo.queueCollection;

public class QNode <T>{
    T value;
    QNode <T> next;

    public QNode(T value) {
        this.value = value;
    }
}
