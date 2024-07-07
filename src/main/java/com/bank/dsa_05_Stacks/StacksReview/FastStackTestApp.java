package com.bank.dsa_05_Stacks.StacksReview;

public class FastStackTestApp {
    public static void main(String[] args) {
        Faststack<Integer> newStack=new Faststack<>();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        System.out.println(newStack.pop());
        newStack.push(5);
        System.out.println(newStack.pop());
    }
}
