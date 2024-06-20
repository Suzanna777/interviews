package com.bank.day_06AlgoPro.PrintMiddleLL;

public class MySinglyLinkedList {
    MyNode head;
    MyNode tail;
    int size;


    boolean isEmpty(){
        return head==null;
    }
    void add(int data){
        MyNode node = new MyNode(data);
        if (isEmpty()){
            head=tail=node;
            size++;
        }
        else {
            tail.next=node;
            tail=node;
            size++;

        }

    }
}
