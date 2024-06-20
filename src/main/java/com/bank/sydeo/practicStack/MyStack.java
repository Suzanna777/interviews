package com.bank.sydeo.practicStack;

import java.util.NoSuchElementException;

public class MyStack <T>{
    public StockNode<T> bottom;
    public StockNode<T> top;

    int size;
    public boolean isEmpty(){
        return bottom == null;
    }

    public void push(T item){
        StockNode<T> node = new StockNode<>(item);
        if (isEmpty()){
            bottom=top=node;
        }
        else{
            top.next = node;
            top = node;
        }
        size++;
    }

    public T peek(){
      return (T) top.data;
    }
    public T pop(){
        StockNode node;
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        if (top==bottom){
            node=top;
            top=bottom=null;
        }
        else {
            node=top;
          StockNode previous=bottom;
          while (previous.next!=top){
              previous=previous.next;
          }
          previous.next=null;
          top=previous;
        }
        size--;
        return (T) node.data;
    }
}
