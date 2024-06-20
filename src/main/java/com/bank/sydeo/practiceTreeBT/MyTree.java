package com.bank.sydeo.practiceTreeBT;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TNode root;

    public MyTree() {
    }


    // insert data to Tree void type to provide the action no return
    void insert(int data) {

        // 1. create a new pattern node to hold data from given {Text}
        TNode node = new TNode(data);
        // 2. if BT pattern root is empty null? then pattern root=nodeText, return;
        if (root == null) {
            root = node;
            return;
        }
        // TN C = PR now compare < my root> with textNode current = root
        TNode current = root;

        while (true) { // while is true
            if (data <= current.data) { // if text data < pattern current.data
                if (current.leftChild == null) { // then, if pattern current child is empty/null
                    // if current left child is empty, then current left child would insert = node to the null data
                    current.leftChild = node;
                    break;
                }
                // yes is less than a data text. then current data = current .left side child
                current = current.leftChild;
            }
            // else if data less > than current data?
            else {
                // if null again
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }


    }

    // - Pre order Root L R
    void preOrder(TNode root) {
        // if root is empty/nool?
        if (root == null) return;
        System.out.print(root.data + " , ");
        preOrder(root.leftChild);
        preOrder(root.rightChild);

    }

    // - In order L Root R
    void inOrder(TNode root) {
        if (root == null) return; // terminate
        inOrder(root.leftChild);
        System.out.print(root.data + " , ");
        inOrder(root.rightChild);
    }


    // - Post order L R Root
    void postOrder(TNode root){
       if (root==null)return;
       postOrder(root.leftChild);
       postOrder(root.rightChild);
       System.out.print(root.data + " , ");
    }

    void levelOrder(TNode root){
        if (root==null) return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TNode visit = queue.poll();
            System.out.print(visit.data + " , ");
            if (visit.leftChild!=null) queue.add(visit.leftChild);
            if (visit.rightChild!=null) queue.add(visit.rightChild);
        }
    }
}
