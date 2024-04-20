package com.bank.leetcode.array;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int current: nums) {
            if(map.containsKey(current) && map.get(current) + 1 > nums.length / 2) {
                return current;
            } else if(map.containsKey(current)) {
                map.put(current, map.get(current) + 1);
            } else {
                map.put(current, 1);
            }
        }

        //no majority element exists
        return -1;
    }
}
