package com.bank.leetCodePrac;

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
       int sizeArr = nums.length;
       int[]answer = new int[sizeArr];

        // Initialize the left and right product arrays
        int[] left = new int[sizeArr];
        int[] right = new int[sizeArr];

        // Compute leftProducts
        left[0] = 1;
        for (int i = 1; i < sizeArr; i++) {
          left[i]= nums[i-1]*left[i-1];
        }
        // Compute rightProducts
        right[sizeArr -1]=1;
        for (int i = sizeArr-2; i >=0 ; i--) {
            right[i] = nums[i+1]* right[i+1];
        }
        // Compute the answer array
        for (int i = 0; i < sizeArr; i++) {
            answer[i] = left[i]* right[i];
        }
        return answer;
    }
}
