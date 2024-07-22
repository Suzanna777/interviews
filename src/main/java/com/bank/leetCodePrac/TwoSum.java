package com.bank.leetCodePrac;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSumNum(int[]array, int targetValue){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int TK = targetValue-array[i];
            if (map.containsKey(TK)) return new int[]
                    { i,map.get(TK) };
            else {
                map.put(array[i],i);
            }
        }
        return new int[]{};
    }
    /*New Map
for(arr){ int PT = T-ar[I]; if (M.containK(PT) return new int[]
{ I, M .get(PM) } else M .put( arr[I], i) } return new int[]  {}*/




}
