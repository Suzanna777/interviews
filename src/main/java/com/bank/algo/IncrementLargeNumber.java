package com.bank.algo;

import java.util.Arrays;

public class IncrementLargeNumber {
    public static int[] increment(int[] digits){
        // 1. Start from the rightmost digit
        for (int i = digits.length -1; i >= 0; i--){
            // 2. Add one to the current digit
            digits[i]++;
            // 3. If the digit is less than 10 after adding one, no need to carry over
            if (digits[i] < 10){
                return digits;
            }
            // 4. If the digit becomes 10, set it to 0 and continue to the next digit
            digits[i] = 0;
        }
        // 5. If we're here, it means all digits were 9, so we need to add (increase size +1) a new digit to the left
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        // Example input: [1, 2, 3]
        int[] digits1 = {1,2,3};
        // Increment the large number
        int[] result1 = increment(digits1);
        // Print the resulting array
        System.out.println("result 1 " + Arrays.toString(result1));
        // Example input: [9]
        int[] digits3 = {9};
        // Increment the large number
        int[] result3 = increment(digits3);
        System.out.println("result 3" + Arrays.toString(result3));
    }

    }


