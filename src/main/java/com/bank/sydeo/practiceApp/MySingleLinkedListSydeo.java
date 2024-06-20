package com.bank.sydeo.practiceApp;

public class MySingleLinkedListSydeo {

    NodeSydeo head;
    NodeSydeo tail;
    int size;

    public MySingleLinkedListSydeo() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int data) {
        // crate new node
        NodeSydeo node = new NodeSydeo(data);
        // if empty
        if (isEmpty()) {
            head = tail = node;
            // increase size
            size++;
        } else { // the tail next is node
            tail.next = node;
            tail = node; // update tail is node
            size++;
        }
    }

    int indexOf(int data) {
        if (isEmpty()) {
            return -1;
        }
        int previous = 0;
        NodeSydeo current = head;
        while (current != null) {
            if (current.data == data) {
                return previous;
            }
            previous++;
            current = current.next;
        }
        return -1;
    }

    void addFirst(int data){
        // create a new node with data
        NodeSydeo node = new NodeSydeo(data);
        // case 1: if a list is empty
        if (isEmpty()){
            head=tail=node;
        }
        // case 2: if a list is not empty
        else {
            node.next=head;
            head=node;
        }
        size++;
    }

    // when we do not know the size of the link
    public int getKthItemFromLast(int k){
       // pointer
       NodeSydeo currentP1 = head;
       NodeSydeo previousP2 = head;

        for (int i = 0; i < k-1; i++) {
            previousP2 = previousP2.next;
        }
        while (previousP2.next!=null){
            currentP1=currentP1.next;
            previousP2=previousP2.next;
        }
        return currentP1.data;
    }

    // remove void method and not return
    public void removeKthItemFromLast(int k){
       NodeSydeo currentP = head;
       NodeSydeo previousP = head;
       NodeSydeo previous = null;

        for (int i = 0; i < k -1; i++) {
            previousP=previousP.next;
        }
        while (previousP.next!=null){
            previous=currentP;
            currentP=currentP.next;
            previousP=previousP.next;
        }
        // case 1:
        if (currentP==head){
            head=currentP.next;
            currentP.next =null;
            size--;
        }
        else if (currentP==tail){
            tail=previous;
            previous.next=null;
            size--;
        }
        else {
            previous.next=currentP.next;
            currentP.next = null;
            size--;
        }
    }


    public void print() {
        // the current node is head
        NodeSydeo current = head;
        while (current != null) { // if current is not last node
            if (current.next == null) {
                System.out.println(current.data + " ->  null ");
            } else {
                System.out.print(current.data + " -> ");
            }
            current = current.next;
        }
    }

    public void deleteByData(int data) {

        if (isEmpty()) {
            System.out.println("is empty");
        }
//     1. Initial State:
        NodeSydeo current = head;
        NodeSydeo previous = head;
//        2. Traverse the List:
        while (current != null) {
            // 4. Check for Matching Data:
            if (current.data == data) {

                //First Iteration: Case 1: Deleting the Head Node:
                if (current == head) {
                    // if current data deleted at the head then
                    // update head = to position to right current next
                    head = current.next;
                    current.next = null;
                }
                // Case 2: Deleting the Tail Node:
                else if (current == tail) {
                    // Move previous to current
                    tail = previous;
                    previous.next = null;
                }
                //  * Case 3 (middle node) applies:
                else { //updated
                    previous.next = current.next;
                    current.next = null;
                }
                // size reduces by one
                size--;
            }
            // Update Pointers:Move previous to current and current to current.next to continue the traversal.
            previous = current;
            current = current.next;

        }
    }


}


