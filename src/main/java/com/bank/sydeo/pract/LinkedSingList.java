package com.bank.sydeo.pract;

import com.bank.sydeo.SuzNode;

public class LinkedSingList {
    NodeSuz head;

    NodeSuz tail;
    int size;
    public LinkedSingList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    public boolean isEmpty(){
        return size == 0;
    }

    public void add(int data){

        // create new node
        NodeSuz node = new NodeSuz(data);

        // update the places if node is empty
        if (isEmpty()){
            head = tail = node;
            // increase the size
            size++;
        }else { // if not empty then tail next add new node and tail is now is referring to the new node
            tail.next = node;
            tail = node;
            size++;
        }


    }


    public void print(){
       NodeSuz current = head;
       // continues utile head is null
        while (current != null){
            if (current.next == null){
                System.out.println(current.data);
            }else {
                System.out.println(current.data + " -> ");
            }
            current = current.next;
        }
    }

}
