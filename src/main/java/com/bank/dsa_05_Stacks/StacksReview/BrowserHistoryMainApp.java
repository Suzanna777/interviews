package com.bank.dsa_05_Stacks.StacksReview;

public class BrowserHistoryMainApp {
    public static void main(String[] args) {

    BrowserHistory bh=new BrowserHistory("leetcode.com");

        bh.visit("google.com");
        bh.visit("facebook.com");
        bh.visit("youtube.com");
        System.out.println(bh.back(2));

    }
}
