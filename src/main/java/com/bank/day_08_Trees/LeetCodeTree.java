package com.bank.day_08_Trees;

public class LeetCodeTree {
    TreeNode root;
    public LeetCodeTree(){
    }
    void insert(int data){
        TreeNode node =new TreeNode (data);
        if (root==null) {
            root=node;
            return;
        }
        TreeNode  current =root;
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

    public TreeNode insertIntoBST(TreeNode root, int data) {
        TreeNode node = new TreeNode(data);
        if (root == null) {
            root = node;
            return root;
        }
        TreeNode current = root;
        while (true) {
            if (data < current.data) {
                if (current.left == null) {
                    current.left = node;
                    return root;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = node;
                    return root;
                }
                current = current.right;
            }
        }
    }
    public TreeNode searchBST(TreeNode root, int data){
       if (root==null) return null;
       TreeNode current = root;
       while (current!=null){
           if (data< current.data) current= current.left;
           else if (data> current.data) current= current.right;
           else return current;
       }
       return null;
    }

    // root left right recursive the method calls itself
    public void preOrderTravel(TreeNode root){
        if (root==null) return;
        System.out.println(root.data + " + ");
        preOrderTravel((root.left));
        preOrderTravel(root.right);
    }
    // left root right
    public void inOrderTravel(TreeNode root){
        if (root==null) return;
        inOrderTravel(root.left);
        System.out.println(root.data + " __ ");
        inOrderTravel(root.right);
    }

    // l right root
    public void postOrderTravel(TreeNode root){
        if (root==null) return;
        postOrderTravel(root.left);
        postOrderTravel(root.right);
        System.out.println(root.data + " __ ");

    }

}
