package com.bank.sydeo.practiceQueue;

public class QNodeSydeo <T>{
    T value;
    QNodeSydeo<T> next;

    public QNodeSydeo(T value) {
        this.value = value;
    }
}
