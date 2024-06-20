package com.bank.sydeo.practiceTreeBT;

public class TreeApp {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        int[] numbers = new int[]{10,6,8,20,4,9,5,17,42,47,29};

        for (int i = 0; i < 11; i++) {
            tree.insert(numbers[i]);
        }
        VisualizeTree.printTree(tree.root, null, false );

        System.out.println("- Pre order Root L R ");
        tree.preOrder(tree.root);

        System.out.println("- in order Root L R ");
        tree.inOrder(tree.root);

        System.out.println("- post Order  L R Root");
        tree.postOrder(tree.root);

        System.out.println("- levelOrder  L R Root");
        tree.levelOrder(tree.root);

    }
}
