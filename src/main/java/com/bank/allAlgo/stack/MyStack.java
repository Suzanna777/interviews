package com.bank.allAlgo.stack;

import java.util.NoSuchElementException;

public class MyStack<T> {
    public SNode<T> bottomHead;
    public SNode<T> topTail;
    int size;
    public boolean isEmpty(){
        return bottomHead==null;
    }

    // Push() - would Add() from tailTop
    public void push(T item){
        SNode<T> node = new SNode<>(item);
        if (isEmpty())bottomHead=topTail=node;
        else {
            topTail.next=node;
            topTail=node;
        }
        size++;
    }

    // return value
    public T peek(){
        return (T) topTail.value;
    }
    // Pop() -   Remove from tailTop
    public T pop(){
        SNode peekNode;
        if (isEmpty()) throw new NoSuchElementException();
        // stack has one element
        if (topTail==bottomHead){
            peekNode=topTail;
            topTail=bottomHead;
            topTail=bottomHead=null;
        }
        // more than one element
        else {
            peekNode=topTail;
            SNode prevN =bottomHead;
            while (prevN.next!=topTail){
                prevN=prevN.next;
            }
            prevN.next=null;
            topTail=prevN;
        }
        size--;
        return (T) peekNode.value;
    }

}
