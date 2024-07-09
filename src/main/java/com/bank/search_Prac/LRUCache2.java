package com.bank.search_Prac;

import java.util.HashMap;
import java.util.Map;

public class LRUCache2 {
    public class DNode {
        int key;
        int data;
        DNode next;
        DNode previous;

        public DNode(int key, int data) {
            this.key = key;
            this.data = data;
        }

        public DNode() {
        }

    }

    // what do I need for LRU?
    int size;
    int capacity;
    DNode head;
    DNode tail;
    HashMap<Integer, DNode> cacheMap = new HashMap<>();

    public LRUCache2(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.head = new DNode();
        this.tail = new DNode();
        this.head.next = tail;
        this.tail.previous = head;
    }

    // method for DNode
    public void addNode(DNode node) {
        node.previous = head; // H P ND for connection for previous ND
        node.next = head.next; // ND next H next
        head.next.previous = node;
        head.next = node;
    }

    public void removeNode(DNode node) {
        DNode previous = node.previous;
        DNode next = node.next;
        previous.next = next;
        next.previous = previous;
    }

    public void moveToHead(DNode node) {
        removeNode(node);
        addNode(node);
    }

    public DNode popTail() {
        DNode popped = tail.previous;
        removeNode(popped);
        return popped;
    }

    public int get(int key) {
        DNode node = cacheMap.get(key);
        if (node == null) return -1;
        else {
            moveToHead(node);
            return node.data;
        }

    }

    public void put(int key, int data) {
        DNode node = cacheMap.get(key);
        if (node == null) {
            DNode newNode = new DNode(key, data);
            cacheMap.put(key, newNode);
            addNode(newNode);
            size++;
            if (size > capacity) {
                DNode last = popTail();
                cacheMap.remove(last.key);
                size--;
            }
            else {
                node.data=data;
                moveToHead(node);
            }
        }
    }

    void printLRU(){
        for(Map.Entry<Integer, DNode> entry: cacheMap.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue().data);
        }
    }

}
