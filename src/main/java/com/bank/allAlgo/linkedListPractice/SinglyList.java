package com.bank.allAlgo.linkedListPractice;

public class SinglyList {
    public static void main(String[] args) {
        SinglyList list = new SinglyList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.print();
        System.out.println();
        System.out.println(" last K data" + list.getKFromLast(3));

        System.out.println();
        list.removeKFromLast(5);
        list.print();

        System.out.println();
        list.addFirst(2);
        list.print();
    }
    MyNode3 head;
    MyNode3 tail;
    MyNode3 next;
    int size;



    // we do not know the item data
    public void removeKFromLast(int data){
        MyNode3 prevN = head;
        MyNode3 curN = head;
        MyNode3 prevTempN = null;

        for (int i = 0; i < data-1; i++) {
            curN = curN.next;
        }
        while (curN.next!=null){
            prevTempN=prevN;
            prevN = prevN.next;
            curN = curN.next;
        }
        // case: remove H
        if (prevN==head){
            head = prevN.next;
            prevN.next=null;
            size--;
        }
        // remove: T case
        else if (prevN==tail) {
            tail= prevTempN;
            prevTempN.next=null;
            size--;
        }
        // case: remove Mid
        else {
            prevTempN.next=prevN.next;
            prevN.next=null;
            size--;
        }

    }

   public int getKFromLast(int value){
        MyNode3 prevNode = head;
        MyNode3 currNode= head;
        for (int i = 0; i < value-1 ; i++) {
            currNode=currNode.next;
        }
        while (currNode.next!=null){
            prevNode=prevNode.next;
            currNode=currNode.next;
        }
        return prevNode.id;
    }

    boolean isEmpty(){
        return head==null;
    }

    void add(int data){
       MyNode3 node = new MyNode3(data);
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

    void addFirst(int data){
        MyNode3 node = new MyNode3(data);
        if (isEmpty()){
            head=tail=node;
        }
        else {
            node.next=head;
            head=node;
        }
        size++;

    }

    void print(){
        MyNode3 curN = head;
        while (curN!=null){
            if (curN==null) {
                System.out.print(curN.id + " => ");
            }
            else {
                System.out.print(curN.id + " => ");
            }
            curN= curN.next;
        }

    }
}
// PN CND