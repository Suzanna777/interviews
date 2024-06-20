package com.bank.sydeo.practiceQueue;

import java.util.NoSuchElementException;

public class MyQueueSydeo<T> {

    QNodeSydeo<T> front;
    QNodeSydeo<T> back;
    int size;

    MyQueueSydeo(){

    }

    boolean isEmpty(){
        return front==null;
    }

    // enqueue not return only action
    void enqueue(T data){
        // initialization
        QNodeSydeo<T> node = new QNodeSydeo(data);
        if (isEmpty()) front = back = node;

        else {
            back.next = node; // node has address of back
            back = node; //
        }
        size++;
    }

    // return
    T dequeue(){
      QNodeSydeo<T> frontNode;
      if (isEmpty()) throw new NoSuchElementException();
      if (front==back){
          frontNode=front;
          front = back =null;
      }
      else {
          frontNode =front;
          front = front.next;
      }
      size--;
      return (T) frontNode.value;
    }

    T peek(){
        return front.value;
    }
    int size(){
        return size;
    }

   void printQueue() {
       if (isEmpty()) return;
       QNodeSydeo<T> current = front;
       while (current != null) {
           System.out.print(current.value);
           if (current.next != null)
               System.out.println();
               System.out.print(" --> ");
               current = current.next;
           }
       }
   }





