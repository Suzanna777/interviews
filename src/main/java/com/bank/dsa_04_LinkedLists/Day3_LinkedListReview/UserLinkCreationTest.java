package com.bank.dsa_04_LinkedLists.Day3_LinkedListReview;

public class UserLinkCreationTest {
    public static void main(String[] args) {
    UserLinkedList2 list=new UserLinkedList2();
    list.printNames();
    list.insertLast(new User("Jason", "AAA"));
    list.insertLast(new User("Jack","Reacher"));
    list.insertLast(new User("Carol","Reacher3"));
    list.printNames();
    list.get(2);
    }
}
