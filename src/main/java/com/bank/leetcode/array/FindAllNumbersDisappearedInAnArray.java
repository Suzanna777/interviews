package com.bank.leetcode.array;
//Given an 'array' of integers where 1 ≤ a[i] ≤ n (n = 'size' of array), some elements
// 'appear' twice and others appear once.
// * int[]    list<> size  remove duplicate hashMap<>
//'Find' all the elements of [1, n] 'inclusive' that do not appear in this array.
// for ( ) 'inclusive'
//Could you do it 'without extra' space and in O(n) runtime? You may 'assume' the 'returned list' does not count 'as' extra space.
// * 'returned list'
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Example:
//Input:
//[4,3,2,7,8,2,3,1]
//Output:
//[5,6]
public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        // 'returned list<> of numbers'
        // create a list<>
        List<Integer> result = new ArrayList<Integer>();
        // create map<>
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // iterate nums and put in index i, value 1 to the map
        for(int i = 1; i <= nums.length; i++) {
            map.put(i, 1);
        }

        // put key of num index [i] if arr contains
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], -1);
            }
        }

        // iterate map a key set and if map red key is not -1 . Then result Addd(i)
        for(int i: map.keySet()) {
            if(map.get(i) != -1) {
                result.add(i);
            }
        }

        return result;
    }
}
