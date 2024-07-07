package com.bank.dsa_05_Stacks.StacksReview;

public class Faststack<T> {
    MySinglyLinkedList<T> list;

    public Faststack() {
        this.list = new MySinglyLinkedList<>();
    }
    int size(){
        return list.size;
    }
    void push(T t){
        list.addFirst(t);
    }
    T pop(){
        return list.removeFirst();
    }

}
