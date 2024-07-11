package com.bank.dsa_04_LinkedLists.Day3_LinkedListReview;

public class UserLinkedList2 {
    User head;
    User tail;
    int size; // this will hold the number of elements in list

    public UserLinkedList2() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void insertLast(User newNode) {
        // 2 cases
        if (isEmpty()) {// 1: list is empty
            head = tail = newNode;
        } else {// 2nd case: list is not empty
            tail.next = newNode;
            tail = newNode;
        }
        size++;

    }

    void printNames() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        User current = head;
        while (current != null) {
            System.out.print(current.name + " => ");
            current = current.next;
        }

    }

    //    void get(int index){
//        if (index>=size){
//            System.out.println("Index out of bounds");
//            return;
//        }else {
//            User current=head;
//            for (int i = 0; i < index; i++) {
//                current=current.next;
//            }
//            System.out.println();
//            System.out.println("Index "+ index + "is = " +current.name);
//        }
//    }
    User get(int index) {
        if (index >= size) {
            System.out.println("Index out of bounds");
            //   return;
        } else {
            User current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        }
        return new User(head.name, tail.lastName);
    }


}
