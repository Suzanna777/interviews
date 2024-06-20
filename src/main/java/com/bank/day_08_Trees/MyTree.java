package com.bank.day_08_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TreeNode root;

    public MyTree() {
    }
    void insert(int data){
        TreeNode node=new TreeNode(data);
        if (root==null) {
            root=node;
            return;
        }
        TreeNode current =root;
        while(true){
            if (data<= current.data){

                if (current.left==null){
                    // if left is null insert there!!!
                    current.left=node;
                    break;
                }
                //if leftChild is not null branch into left subtree!!
                current=current.left;
            }
            else {
                if (current.right==null){
                    // if right is null insert there!!!
                    current.right=node;
                    break;
                }
                //if rightChild is not null branch into right subtree!!
                current=current.right;
            }
        }
    }

    // PreOrder Traversal of the tree
    // Root-Left-right
    void preOrderTraversal(TreeNode root){
        if(root==null) return;// termination
        System.out.print(root.data +", "); // visit root
        preOrderTraversal(root.left);  // visit left subtree
        preOrderTraversal(root.right); // visit right subtree
    }
    void inOrderTraversal(TreeNode root){
        if (root==null) return; // termination
        inOrderTraversal(root.left);
        System.out.print(root.data+", ");
        inOrderTraversal(root.right);
    }
    void postOrderTraversal(TreeNode root){
        if (root==null) return;// termination
        postOrderTraversal(root.left); // branch and finish left subtree
        postOrderTraversal(root.right); // branch and finish right subtree
        System.out.print(root.data+", ");  // visit root
    }
    void levelOrderTraversal(){
        if(root==null) return;
        Queue<TreeNode>  queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode toVisit=queue.poll();
            System.out.print(toVisit.data+", ");
            if (toVisit.left!=null) queue.add(toVisit.left);
            if (toVisit.right!=null) queue.add(toVisit.right);
        }
    }
    public boolean contains(int data){
        if (root==null) return false;
        TreeNode current= root;
        while (current!=null) {
            if (data<current.data) current=current.left;
            else if (data> current.data) current=current.right;
            else return true;
        }
        return false;
    }
    public boolean isLeaf(TreeNode node) {
        return node.left==null && node.right==null;
    }
    public void printLeaves(TreeNode root){
        if (root==null) return;
        // perform visit on Root

        // Recursively Branch Left Subtree
        printLeaves(root.left);
        printLeaves(root.right);
        if (isLeaf(root)) System.out.print(root.data + ", ");

        // Recursively Branch Right Subtree
    }
    int countLeaves(TreeNode root){
        if (root==null) return 0;
        if (isLeaf(root)) return 1;
        // recursively left
        // recursively right
        return countLeaves(root.left) + countLeaves(root.right);
    }
    int findSumOfLeaves(TreeNode root){
        if (root==null) return 0;
        if (isLeaf(root)) return root.data;
        return findSumOfLeaves(root.left) + findSumOfLeaves(root.right);
    }
    int height(TreeNode root){
        if (root==null) return -1;
        if (isLeaf(root)) return 0;
        return 1+ Math.max(height(root.left), height(root.right));
    }
    public int calculateNodeDepthSums(){
        return nodeDepthSums(root, 0);
    }
    // Assignment  Sum of Node Depths
    public int nodeDepthSums(TreeNode node, int A){
        if(node==null) return 0;
        System.out.println(A);
        return A+nodeDepthSums(node.left, A+1) +nodeDepthSums(node.right, A+1);
    }
    // Assignment  Sum of All Nodes recursively
    public int calculateNodeSums(){
        return nodeSums(root);
    }

    public int nodeSums(TreeNode node){
        if(node==null) return 0;

        return node.data+ nodeSums(node.left)+nodeSums(node.right);
    }
    // Sum of all Nodes
}
