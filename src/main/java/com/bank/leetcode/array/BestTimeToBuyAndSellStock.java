package com.bank.leetcode.array;
// Say you have an array for which the ith element
// is the price of a given stock on day i.

// If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
// design an algorithm to find the maximum profit.

// Example 1:
// Input: [7, 1, 5, 3, 6, 4]
// Output: 5
// max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)

// Example 2:
// Input: [7, 6, 4, 3, 1]
// Output: 0
// In this case, no transaction is done, i.e. max profit = 0.
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        // Create an instance of the class containing the maxProfit method
       BestTimeToBuyAndSellStock best = new BestTimeToBuyAndSellStock();

        // Define an array of prices
        int[] price = {7, 1, 5, 3, 6, 4};
        // Call the maxProfit method and print the result
        int maxProfit = best.maxProfit(price);
        System.out.println("Maximum profit: " + maxProfit);
    }
    public int maxProfit(int[] prices) {
        //algorithm
        if(prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int max = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > min) {
                max = Math.max(max, prices[i] - min);
            } else {
                min = prices[i];
            }
        }
        return max;
    }
}
