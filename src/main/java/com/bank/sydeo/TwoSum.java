package com.bank.sydeo;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = new int[] {2,7,9,11};
        System.out.println(Arrays.toString(twoSumSolution(array, 20)));
    }

    public static int[] twoSumSolution(int[] array, int target){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (i != j) {
                    if (array[i] + array[j] == target)
                        return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    
}
