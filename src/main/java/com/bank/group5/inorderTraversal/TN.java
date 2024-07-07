package com.bank.group5.inorderTraversal;

public class TN {
    int data;
    TN leftChild;
    TN rightChild;

    public TN() {
    }


    public TN(int data) {
        this.data = data;
    }

    public TN(int data, TN leftChild, TN rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
