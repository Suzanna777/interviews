package com.bank.day_06AlgoPro.PrintMiddleLL;

public class PrintMiddleNode {
    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();
        for (int i = 0; i <= 6; i++) {
            list.add(i);
        }
    }
        public void printMiddle(MySinglyLinkedList text){
      // leedCode has  ListNode pointer1 = head;
        MyNode pointer1 = text.head;
        MyNode pointer2 = text.head;

        // leedCode has this structure
            // while (pointer2.next != null && pointer2.next.next !=null)
        while (pointer2 != text.tail && pointer2.next != text.tail){
            pointer1=pointer1.next;
            pointer2=pointer2.next.next;
        }
        if (pointer2==text.tail) System.out.println(pointer1.data);
        else System.out.println(pointer1.data + pointer1.next.data);
    }

//    public static void printMiddle(MySinglyLinkedList node){
//        MyNode pointer1 = node.head;
//        MyNode pointer2 = node.head;
//
//        while (pointer2!=node.tail && pointer1.next!=node.tail){
//           pointer1=pointer1.next; // single jump
//           pointer2=pointer2.next.next; // double jump
//        }
//        if (pointer2==node.tail) System.out.println(pointer1.data);
//        else System.out.println(pointer1.data + pointer1.next.data);
//    }

//    public static void printMiddle(MySinglyLinkedList text) {
//      MyNode pointer1 = text.head;
//      MyNode pointer2 = text.head;
//            // sing jump // double
//       while (pointer2!=text.tail&&pointer2.next!=text.tail){
//           pointer1 = pointer1.next;
//           pointer2 = pointer2.next.next;
//       }
//       if (pointer2==text.tail) System.out.println("odd " +pointer1.data);
//       else System.out.println("even " +pointer1.data + pointer1.next.data);
//    }


        // odd number of node
        //"even number of node

    }


