package com.bank.dsa_suz_01_LinkedLists;

import java.util.Arrays;
import java.util.LinkedList;

public class NodeApp {
    public static void main(String[] args) {
      SinglyLink node = new SinglyLink();
        System.out.println(node.isEmpty());
        for (int i = 0; i < 3; i++) {
            node.add(i);
        }
        node.print();

    }


}
