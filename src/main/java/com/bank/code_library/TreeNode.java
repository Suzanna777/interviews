package com.bank.code_library;

/*   TreeNode (Binary Search Tree)
 While it's perfectly fine-even good-to use the built-in binary tree class when possible*/
// For simplicity, we'd implemented this tree as storing integers for data.
public class TreeNode { // (same as a Binary Search Tree)
    // data, size, left, right, parent,
    // method inserts in order(), size(), find data, left child, right child
    public int data;
    public TreeNode left, right, parent;
    private int size = 0;
    public TreeNode(int d) {
        data = d;
        size = 1;
    }
    public void insertInOrder(int d) {
        if (d <= data) {
            if (left == null) {
                setLeftChild(new TreeNode(d));
            } else {
                left.insertInOrder(d);
            }
        } else {
            if (right == null) {
                setRightChild(new TreeNode(d));
            } else {
                right.insertInOrder(d);
            }
        }
        size++;
    }

    public int size() {
        return size;
    }
    public TreeNode find(int d) {
        if (d == data) {
            return this;
        } else if (d <= data) {
            return left != null ? left.find(d) : null;
        } else if (d > data) {
            return right != null ? right.find(d) : null;
        }
        return null;
    }

    public void setLeftChild(TreeNode left) {
        this.left = left;
        if (left != null) {
            left.parent = this;
        }
    }

    public void setRightChild(TreeNode right) {
        this.right = right;
        if (right != null) {
            right.parent = this;
        }
    }
}




