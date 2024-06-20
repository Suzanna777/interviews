package com.bank.sydeo.practicStack.recursive;

public class RecursiveFibonacci {

    public static void main(String[] args) {
        System.out.println(fib(2)); // 2
    }

    public static int fib(int data){
        if (data==0){
            return 0;
        }
        if (data==1){
            return 1;
        }
       return fib(data-1)+fib(data-2);
    }

}
