package com.bank.leetCodePrac;

public class MyTreeNode {
    MyTreeNode leftChild;
    MyTreeNode rightChild;
    int value;

    public MyTreeNode(int value) {
        this.value = value;
    }

    public MyTreeNode() {}

    public MyTreeNode(MyTreeNode leftChild, MyTreeNode rightChild, int value) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.value = value;
    }
}
