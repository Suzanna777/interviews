package com.bank.leetcode.array2;

import java.util.Arrays;

// Check Permutation: Given two strings, write a method to decide if one is a permutation of the
//other.
/* Solution #1: Sort the strings.
If two strings are permutations, then we know they have the same characters, but in different orders. Therefore, sorting the strings will put the characters from two permutations in the same order. We just need to
compare the sorted versions of the strings. */
public class Check_Permutation {

    String sotr(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    boolean permutation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        return sotr(s).equals(sotr(t));
    }

    // Solution #2: Check if the two strings have identical character counts.

    /* We can also use the definition of a permutation-two words
    with the same character counts-to implement this algorithm.
     We simply iterate through this code, counting how many times each character appears.
Then, afterwards, we compare the two arrays.*/
   /* 1. boolean st1, st2; if st1.leng is not = to str2.leng return fals;
   *  2. create new arr to store specif numb of letter: int[] letter = new int[128];
   *   1a. assign every char[] arrCh1 from st1.toCharArray;
   *   1b. iterate eachChares of arrCh1 ++
   *   2a. iterate each start from the last index of str2 --
   *   2b. assign every int c = (int) str2 .charAt(i)
   *   2c. condition for a letter cannot be less than -0 if new letter[c] is less than 0 return false */
//    boolean permutation2(String s, String t){
//        if (s.length() != t.length()){
//            return false;
//        }
//        int[] letters = new int[128]; // assume
//        char[] s_array = s.toCharArray(); // assign
//        for (char c : s_array){ // to count the number of each char in s.
//            letters[c]++;
//        } // iterate
//        for (int i = 0; i < t.length(); i++){
//            int c = (int) t.charAt(i);
//            letters[c]--;
//            if (letters[c] < 0){
//                return false;
//            }
//        }
//        return true;
//    }

    boolean permutation2(String str1, String str2){
        // 1. check if both sizes are str1 and str2 are queal
        if (str1.length() != str2.length()){
            return false;
        }
        // 2. create new arr[] to keep 128 char
        int[] letter = new int[128];
        // 3. assign
        char[] ch_st1 = str1.toCharArray();
       // 4. iterate
        for (char c : ch_st1){
            // new arr[] continue for ech [c] iteration ++
            letter[c]++;
        }
        // 5. iterate str2 if str2 contain 128 numbers
        for (int i = 0; i < str2.length(); i++){
           // 6. assign
            int c = (int) str2.charAt(i);
            // 7. removes after every iteration -- from a new created letter
            letter[c] --;
            // 8. if new arr[] with char of st2 is less than
            if (letter[c] < 0){
                return false;
            }
        }
        return true;
    }

}
