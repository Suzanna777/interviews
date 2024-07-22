package com.bank.dsa_suz_01_LinkedLists;

public class SinglyLink {
    // Node has data and address to the next Node
    Node_My head;
    Node_My tail;
    int size;
    boolean isEmpty(){
        return head == null;
    }

    void add(int data){
        Node_My node = new Node_My(data);
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
    // CN = HN CN !null; if CNextN ==nullN(no nextN)  CN.idN; else CN .idNextNode; CN = CNNext
    void print() {
        Node_My current = head;
        while (current!=null){
            if (current.next==null) {
                System.out.print(current.id + " => ");
            }
            else {
                System.out.println(current.id + " => ");
            }
            current = current.next;
        }

    }
}
