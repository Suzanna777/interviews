package com.bank.node;

import com.bank.code_library.TreeNode;

/*  TreeNode represents each room in the treehouse.
convertToDoublyLinkedList is the method that converts the tree into a doubly linked list.
We use a prev variable to keep track of the previously visited room.
The convert method recursively visits each room, connecting it to the previous room and updating the prev variable.
Finally, we close the loop by connecting the head and tail of the list.*/
public class BinaryTreeToDoublyLinkedList {

    // NR NL V - NP
    private TreeNode prev;

    // method convert
    public TreeNode convertToDoublyLikedList(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode dummy = new TreeNode(0);
        prev = dummy;
        convert(root);

        prev.right = dummy.right;
        dummy.right.left = prev;
        return dummy.right;
    }
    private void convert(TreeNode node){
        if(node == null){
            return;
        }
        convert(node.left);

        // Make the current node's left point to the previously visited node
        node.left = prev;
        // Make the previous node's right point to the current node
        prev.right = node;
       // Update the previous node to the current node
        prev = node;

        convert(node.right);
    }

    // 1. class Node - value, left, right
    class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
       TreeNode(int value){
           this.value = value;
       }

    }
}
