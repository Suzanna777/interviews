package com.bank.day03;

public class MySinglyList {
    MyNode head;
    MyNode tail;
    int size;

    public MySinglyList() {
    }

    boolean isEmpty() {
        return head == null;
    }

    public void addNode(MyNode node) {
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void printNode() {
        if (isEmpty()) {
            System.out.println("is empty");
            return;
        }
        MyNode current = head;
        while (current != null) {
            System.out.println(current.data + " = >");
            current = current.next;
        }
    }

    MyNode findIndex(int index) {
        if (index >= size) {
            System.out.println("is out of boudary");
            return null;
        } else {
            MyNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            System.out.println();
            System.out.println("data is = >"+ current.data);
            return current;
        }
    }
    void get(int index){
        if (index>=size){
            System.out.println("index ot of boundary ");
        }
        else {
            MyNode current = head;
            for (int i=0; i < index;i++){
                current=current.next;
            }
            System.out.println();
            System.out.println("index  " + index + " is " + current.data);
        }
    }

    // delete H
    void deleteH(int data){
        if (isEmpty()){
            System.out.println("is empty");
            return;
        }
        MyNode previous = head;
        MyNode current = head;
        while (current!=null){
          if (current.data==data) {
              // H
              if (current == head) {
                  if (head == tail) tail = null;
                  current.next = null; // terminate
              }
              // delete T (H PND next CND T; (if C? = T) P next is 0; and T = P
              else if (current == tail) {
                  previous.next = null;
                  tail = previous;
              }
              // M
              else {
                  previous.next = current.next; // break the link between
                  current.next = null; // current is 0
              }
              size--;
          }
             // no match
              previous=current;
              current=current.next;
          }
        }
    }


