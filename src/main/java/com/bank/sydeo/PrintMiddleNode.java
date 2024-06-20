package com.bank.sydeo;



public class PrintMiddleNode {
    public static void main(String[] args) {
        MySinglyLinkedList patternSlow = new MySinglyLinkedList();
        for (int i = 1; i <= 5 ; i++) { // 1 2 3
            patternSlow.add(i); // 2 3
        }
        printMiddle(patternSlow);
    }

    public static void printMiddle(MySinglyLinkedList patternSlow){
        // initiolate pointer
       SuzNode a = patternSlow.head;
       SuzNode b = patternSlow.head;

       // itterate over the list untile b is not pattern tail AND b next node is not pattern tail
        while (b!=patternSlow.tail && b.next!=patternSlow.tail){
            a=a.next; // single jump
            b=b.next.next; // double jump
        }

        if (b==patternSlow.tail) System.out.println(a.id); // on tail, odd number

        else System.out.println(a.id + " , " + a.next.id); // before tail, even number

    }
}
