package com.bank.sydeo;

import java.util.ArrayList;

public class LinkedListDemo {

    public static void main(String[] args) {
        SuzNode node1 = new SuzNode(1);
        SuzNode node2 = new SuzNode(2);
        SuzNode node3 = new SuzNode(3);
        SuzNode node4 = new SuzNode(4);

        node1.next = node2;
        node2.next = node3;

        System.out.println(node1.id);
        System.out.println(node1.next.next.id + " pointing to the next id address");


        SuzNode current;
        SuzNode head = node1; // head is starting from 1
        current=head; // current is 1
        while (current != null){
            System.out.println("id of suznode is " + current.id);
            current = current.next;
        }

    }


    ArrayList<SuzNode> suzNodeArrList = new ArrayList<>();



}


