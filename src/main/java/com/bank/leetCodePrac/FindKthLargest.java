package com.bank.leetCodePrac;

import java.util.Random;

public class FindKthLargest {

    public int findKthLargest(int[]nums, int k) {
        int head = 0;
        int tail = nums.length - 1;
        Random random = new Random();
        while (true) {
            int pivot_index = head + random.nextInt(tail-head+1);
            int new_pivot_index = partition(nums,head,tail,pivot_index);
            if (new_pivot_index==nums.length-k){
                return nums[new_pivot_index];
            }
            else if (new_pivot_index>nums.length-k){
                tail=new_pivot_index-1;
            }
            else {
             head =  new_pivot_index+1;
            }
        }
    }
    private int partition(int[]nums, int left, int right, int pivot_index ){
        int pivot = nums[pivot_index];
        swab(nums, pivot_index, left);
        int stored_index = left;
        for (int i = left; i < right; i++) {
            if (nums[i] < pivot_index){
                swab(nums,i,stored_index);
            }
        }
        swab(nums,right,stored_index);
        return stored_index;
    }
    private void swab(int[]nums, int a, int b){
       int temp = nums[a];
       nums[a]=nums[b];
       nums[b] =temp;
    }

}
