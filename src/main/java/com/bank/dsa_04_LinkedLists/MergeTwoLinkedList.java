package com.bank.dsa_04_LinkedLists;

public class MergeTwoLinkedList{
    public static Node mergeLinkedLists(Node cn1, Node cn2) {
       Node n3head = new Node();
        Node prev = n3head;
        while (cn1 != null && cn2 != null) {
            if (cn1.id< cn2.id) {
               prev.next = cn1;
               cn1 = cn1.next;
            } else { prev.next = cn2;
                prev.next = cn2;
                cn2 = cn2.next;
            }
            prev = prev.next;
        }
        if (cn1 == null) prev.next = cn2;
        else prev.next = cn1;
        return n3head.next;
    }
}
