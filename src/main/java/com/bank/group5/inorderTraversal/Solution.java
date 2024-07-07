package com.bank.group5.inorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public List<Integer> inorderTraversal(TN root) {
        // initialise list of nodes, stock node, current node starter
        List<Integer> listNode = new ArrayList<>();
        Stack<TN> stackNode = new Stack<>();
        TN current = root;

        // current root has data but new copy stack is empty
        while (current!=null || stackNode.isEmpty()){
           // do it until current would not have any data (H L R)
            while (current!=null){
                // thus stack push current data to head
                stackNode.push(current);
                // then current next data to the left side (smaller data 2)
                current=current.leftChild;
            }
            // current data pop from the stack
            current=stackNode.pop();
            // Then a list adds current data to the list
            listNode.add(current.data);
            //then current next data to the right side
            current=current.rightChild;
        }
        return listNode;
    }
}
