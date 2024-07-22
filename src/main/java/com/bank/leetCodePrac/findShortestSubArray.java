package com.bank.leetCodePrac;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class findShortestSubArray {


    public int findShortest(int[]nums){
        Map<Integer,Integer> headTop = new HashMap<>();
        Map<Integer,Integer> tailBottom = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int j = nums[i];
            if (headTop.get(j)==null){
                headTop.put(j,i);
            }
            tailBottom.put(j,i);
            count.put(j,count.getOrDefault(j,0)+1);
        }
        System.out.println(headTop);
        System.out.println(tailBottom);
        System.out.println(count);
        int answer = nums.length;
        int degree = Collections.max(count.values());
        System.out.println(degree);
        for (int j:count.keySet()) {
            if (count.get(j)==degree){
                System.out.println(j);
                answer=Math.min(answer,tailBottom.get(j)-headTop.get(j)+1);
            }
        }
        return answer;
    }

}
