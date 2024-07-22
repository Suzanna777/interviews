package com.bank.dsa_suz_01_LinkedLists;

import java.util.Arrays;

public class SinglyLinkedDelete {

    public static void main(String[] args) {
        SinglyLinkedDelete node = new SinglyLinkedDelete();
        System.out.println(node.isEmptyNode());



        for (int i = 0; i < 10; i++) {
            node.addNode(i);
        }
        node.printNode();
        node.deleteNode(7);
        System.out.println();
        node.printNode();


        System.out.println();
        node.printNode();

    }
    MyNode2 head;
    MyNode2 tail;
    int size;

    boolean isEmptyNode(){
        return head==null;
    }
    void addNode(int data){
        MyNode2 node = new MyNode2(data);
        if (isEmptyNode()){
            head = tail = node;
            size++;
        }
        else {
            tail.next=node;
            tail=node;
            size++;
        }

    }

   public void deleteNode(int id){
      if (isEmptyNode()) {
          System.out.println("list is empty");
      }
      MyNode2 prevNode = head;
      MyNode2 currentNodeDelete = head;
      while (currentNodeDelete!=null){
          if (currentNodeDelete.id==id){

              // case 1: H
              if (currentNodeDelete==head){
                  head=currentNodeDelete.next;
                  currentNodeDelete.next=null;
              }

              // case 3: T
              else if (currentNodeDelete==tail){
                  tail=prevNode;
                  prevNode.next=null;
              }

              // case 2: Mid
              else {
                  prevNode.next=currentNodeDelete.next;
                  currentNodeDelete.next=null;
              }
              size--;
          }
          prevNode=currentNodeDelete;
          currentNodeDelete=currentNodeDelete.next;
      }
        // case 1: H

        // case 3: T
    }

   int indexOf(int id){
    if (isEmptyNode())return -1;
    int idxP = 0;
     MyNode2 currentNodeId = head;
     while (currentNodeId!=null){
       if (currentNodeId.id==id)return idxP;
       idxP++;
       currentNodeId=currentNodeId.next;
     }
     return -1;
   }

   void addFirst(int data){
        MyNode2 node = new MyNode2(data);
        if (isEmptyNode()){
            head=tail=node;
        }
        else {
            node.next=head;
            head=node;
        }
        size++;
   }

   public int getKthLast(int k){
      MyNode2 node = new MyNode2(k);
      MyNode2 previousK =head;
      MyNode2 currentLastK =head;
       for (int i = 0; i < k-1; i++) {
          currentLastK=currentLastK.next;
       }
       while (currentLastK.next!=null){
           previousK=previousK.next;
           currentLastK=currentLastK.next;

       }
       return previousK.id;
   }
    void printNode(){
       MyNode2 node = head;
        while (node !=null){
            if (node.next==null) System.out.print(node.id + " => null ");
            else {
                System.out.print(node.id + " => ");
            }
            node= node.next;
        }
    }
}
