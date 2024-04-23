package com.bank.leetcode.array2;
/*  Given a string, write a function to check if it is a permutation of
a palindrome.
A palindrome is a word or phrase that is the same forwards and backwards.
A permutation is a rearrangement of letters.
The palindrome does not need to be limited to justdictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat'; "atco cta·; etc.)

 Implementing this algorithm is fairly straightforward.
 We use a hash table to count how many times each character appears.
 Then, we iterate through the hash table
 and ensure that no more than one character has
 an odd count. */
public class PalindromePermutation {
    // Solution#1
    boolean isPermutationOfPalindrome(String phrase){
        int[] table = buildCharFreguencyTable(phrase);
        return checkMaxOneOdd(table);
    }
    /* Check that no more than one character has an odd count. */
    boolean checkMaxOneOdd(int[] table){
        boolean foundOdd = false;
        for (int count : table){
            if (count % 2 == 1){
                if (foundOdd){
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

     /* Map each character to a number.
     a -> 0, b -> 1, c -> 2, etc.
 *   This is case insensitive.
     Non-letter characters map to -1. */

    int getCharNumber(Character c){
      // assign char to int a, z, val
       int a = Character.getNumericValue('a') ;
       int z = Character.getNumericValue('z');
       int val = Character.getNumericValue(c);
       // left side:
        // if int a less than < int value
        // and int value is < less than z
        // Thus mean: value int somewhere between
        // then value int - int a
       if (a <= val && val <= z ){
           return val - a;
       }
       return -1;  // Non-letter characters map to -1
    }

    /* 2. Count how many times each character appears. */
    int[] buildCharFreguencyTable(String phrase){
        // create new arr[] the last char - the first char + 1
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
       // iterate eachChar of string to charArray
        for (char c : phrase.toCharArray()){
            // assign int x to read char 'c'
            int x = getCharNumber(c);
            if (x != -1){
                // if x is not Non-letter characters map to -1
                table[x]++;
                // then arr add char c
            }
        }
        return table;
        // This algorithm takes O ( N) time, where N is the length of the string.
    }


    // Solution #2
    boolean isPermutationOfPalindrome2(String phrase){
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()){
            int x = getCharNumber(c);
            if (x != -1){
                table[x]++;
                if (table[x] % 2 == 1){
                    countOdd++;
                }
                else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }

}
