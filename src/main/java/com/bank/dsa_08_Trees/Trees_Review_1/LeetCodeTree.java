package com.bank.dsa_08_Trees.Trees_Review_1;

public class LeetCodeTree {
    TreeNode root;

    public LeetCodeTree() {
    }
    void insert(int val) {
        TreeNode newNode = new TreeNode(val);
        // Tree is empty case
        if (root == null) {
            root = newNode;
            return;
        }
        // If tree is not empty find a place to insert new node
        TreeNode current = root;// start with root
        while (true) {
            if (val <= current.val) {

                if (current.left == null) {
                    // if left is null insert there!!!
                    current.left = newNode;
                    break;
                }
                //if left is not null branch into left subtree!!
                current = current.left;
            } else {
                if (current.right == null) {
                    // if right is null insert there!!!
                    current.right = newNode;
                    break;
                }
                //if rightChild is not null branch into right subtree!!
                current = current.right;
            }
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if(root==null) { // Tree empty
            root=newNode;
            return root;
        }
        // Not empty
        TreeNode current=root;
        while(true){
          if (val< current.val){
              if(current.left==null){
                  // insert node here!!!
                  current.left=newNode;
                  return root;
              }
              current=current.left;// branch into left sub-tree
          } else {
              if(current.right==null){
                  // insert node here!!!
                  current.right=newNode;
                  return root;
              }
              current=current.right;// branch into right sub-tree
          }
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root==null) return null;
        TreeNode current=root;
        while(current!=null){
            if (val< current.val) current=current.left;
            else if (val>current.val) current=current.right;
            else return current;
        }
        return null;
    }
    // Root-Left-Right
    public void preOrderTraversal(TreeNode root){
        // termination
        if (root==null) return;
        System.out.print(root.val+ ", ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    // left-Root-Right
    public void inOrderTraversal(TreeNode root){
        if (root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.val+ ", ");
        inOrderTraversal(root.right);
    }
    // left-Right-root
    public void postOrderTraversal(TreeNode root){
        if (root==null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+ ", ");
    }
}
