package com.bank.leetCodePrac;

public class flipEquivBT {

    public boolean flipEquiv(MyTreeNode root1, MyTreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.value != root2.value) {
            return false;
        }
        boolean notflip = flipEquiv(root1.rightChild, root2.rightChild);
        boolean flip = flipEquiv(root1.leftChild, root2.rightChild) && flipEquiv(root1.rightChild, root2.leftChild);
        return notflip || flip;
    }

    public boolean flipEquiv2(MyTreeNode root1, MyTreeNode root2){
        if (root1==null || root2==null){
            return root1==null && root2==null;
        }
        if (root1.value!=root2.value){
            return false;
        }
        return
                (flipEquiv(root1.leftChild,root2.leftChild) && flipEquiv(root1.rightChild, root2.rightChild))
                || (flipEquiv(root1.leftChild, root2.rightChild) && flipEquiv(root1.rightChild,root2.leftChild));

    }

    /* IF  ( R1/null OR R2/null ) { return  R1/null AND R2/null }
         IF  R1 .V!=P2 .V { return F}
        return  // We can compare ( L/L AND R/R )     OR     ( L/R AND R/L)*/
    public boolean flipEquiv3(MyTreeNode R1, MyTreeNode R2){
        if (R1==null || R2==null) {
            return R1==null && R2==null;
        }
        if (R1.value!=R2.value){
            return false;
        }
        return ( flipEquiv(R1.leftChild, R2.leftChild) && flipEquiv(R1.rightChild,R2.rightChild) )
        || ( flipEquiv(R1.leftChild,R2.rightChild) && flipEquiv(R1.rightChild, R2.leftChild) );
    }



}

