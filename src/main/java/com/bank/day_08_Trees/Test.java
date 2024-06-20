package com.bank.day_08_Trees;

public class Test {
    public static void main(String[] args) {
        LeetCodeTree tree = new LeetCodeTree();
        tree.insert(10);
        tree.insert(4);
        tree.insert(12);
        tree.insert(5);
        VisualizeTree.printTree(tree.root, null, false);

        System.out.println(tree.searchBST(tree.root, 4).data);
        System.out.println(tree.insertIntoBST(tree.root, 15).data);
        VisualizeTree.printTree(tree.root, null, false);

        tree.preOrderTravel(tree.root);
        System.out.println();
       tree.inOrderTravel(tree.root);
        System.out.println();
        tree.postOrderTravel(tree.root);
    }
}
