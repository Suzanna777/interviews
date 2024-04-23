package com.bank.leetcode.sorting_searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;

/*  Group Anagrams: Write a method to sort an array ot strings so that all tne anagrnms are next to
    each other.

   SOLUTION
 This problem asks us to group the strings in an array
 such that the anagrams appear next to each other.
 Note that no specific ordering of the words is required,
 other than this.
 We need a quick and easy way of determining
 if two strings are anagrams of each other.
 What defines if two words are anagrams of each other?
 Well, anagrams are words
 that have the same characters but in different orders.
 It follows then that if we can put the characters in the same order,
 we can easily check if the new words are identical.
 One way to do this is to just apply any standard sorting algorithm,
 like merge sort or quick sort, and modify the comparator.
 This comparator will be used to indicate that two strings which are anagrams of each other
 are equivalent.
 What's the easiest way of checking if two words are anagrams?
 We could count the occurrences of the distinct characters in each string
 and return true if they match.
 Or, we could just sort the string.
 After all, two words which are anagrams will look the same once they're sorted.
 The code below implements the comparator.*/
public class GroupAnagrams {
 //
    class AnagramComparator implements Comparator<String>{
        public String sortChars(String s){
            char[] content = s.toCharArray();
            Arrays.sort(content);
            return new String(content);
        }
        public int compare(String s1, String s2) {
            return sortChars(s1).compareTo(sortChars(s2));
        }
    } // This algorithm will take O(n log(n)) time.


    /* We can do this by using a hash table which maps from the sorted version of a word
    to a list of its anagrams.
  So, for example, acre will map to the list {acre, race, care}.
  Once we've grouped all the words into
  these lists by anagram, we can then put them back into the array.
  The code below implements this algorithm*/

 //   Arrays.sort(array, new AnagramComparator());
//    void sort(String[] array){
//       HashMapList<String, String> mapList = new HashMapList<String, String>;
//
//        /* Group words by anagram */
//        for (String s : array){
//            String key = sortChars(s);
//            mapList.put(key, s);
//        }
//        /* Convert hash table to array*/
//        int index = 0;
//        for (String key : mapList.keySet()){
//            ArrayList<String> list = mapList.get(key);
//            for (String t : list){
//                array[index] = t;
//                index++;
//            }
//        }
//    }

    String sortChars(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
