package com.bank.sydeo.practicStack.collectionStock;

import com.bank.sydeo.practicStack.MyStack;

public class ExprBalanceCheck {

    public static void main(String[] args) {

    }

    public static boolean balanceCheck(String expr){
        MyStack<Character> stackNode = new MyStack<>();
        for (int i = 0; i < expr.length(); i++) {
            // create character obj ch.charAt itterate every ch i
            Character ch = expr.charAt(i);
            if (ch!='(' && ch!='[' && ch!='{' && ch!=')' && ch!=']' && ch!='}') continue;
            if (ch=='(' ||ch =='[' || ch=='{'){
                stackNode.push(ch);
                continue;
            }

            if (stackNode.isEmpty()){
                return false;
            }
            switch (ch){
                case ')':
                    if (stackNode.pop()!='(')
                        return false;
                    break;
                case ']':
                    if (stackNode.pop()!='['){
                        return false;
                    }
                    break;
                case '}':
                    if (stackNode.pop()!='{'){
                        return false;
                    }
                    break;
            }
        }
        return stackNode.isEmpty();
    }
}
