package com.bank.sydeo.pract.node2;

public class TestMyList {
    public static void main(String[] args) {
        MySinglyList myList = new MySinglyList();
        System.out.println(myList.isEmpty());

        for (int i = 0; i < 10 ; i++) {
            myList.insert(i);
        }
        myList.printNodes();
        myList.deleteByData(9);
        myList.printNodes();
        System.out.println("index of 3 " + myList.indexOf(3));
    }
}
