package com.bank.day_06AlgoPro.PrintMiddleLL;

public class DeleteNode {

    public static void main(String[] args) {
        MySinglyLinkedList text = new MySinglyLinkedList();

        text.add(4);
        text.add(5);
        text.add(1);
        text.add(9);
        System.out.println("Initial list:");
        printList(text.head);

        deleteNodeLinkedList(text,1);
        System.out.println(" List after deleting the node with value 1:");
        printList(text.head);

    }
    public static void deleteNodeLinkedList(MySinglyLinkedList text, int val){
        MyNode current =text.head;
        MyNode previous = null;
        while (current!=null&& current.data!=val){
            previous=current;
            current=current.next;
        }
        if (current!= null){
            if (previous==null){
                text.head=current.next;
            }
            else {
                previous.next = current.next;
            }
            if (current==text.tail){
                text.tail=previous;
            }
            else {
                System.out.println(val + " not found");
            }
        }




    }

    public static void printList(MyNode  head) {
        MyNode current = head;
        while (current != null) {
            System.out.print(current.data + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    /*Input: head = [4,5,1,9], node = 5
            Output: [4,1,9] P C P C  delete C
Input: head = [4,5,1,9], node = 1
      Output: [4,5,9]   P C P C  delete P */
}
