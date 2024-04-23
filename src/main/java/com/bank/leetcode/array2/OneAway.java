package com.bank.leetcode.array2;
/* There are three types of edits that can be performed on strings: insert a character,
 remove a character, or replace a character. Given two strings, write a function to check if they are
 one edit (or zero edits) away.
 EXAMPLE
 pale, ple -> true
 pales, pale -> true
 pale, bale -> true
 pale, bae -> false*/
public class OneAway {
    boolean  oneEditAway(String first, String second){
        if(first.length() == second.length()){
            return  oneEditReplace(first, second);
        }
        else if(first.length() + 1 == second.length()){
            return oneEdintInsert(first, second);
        }
        else  if (first.length() -1 == second.length()){
            return oneEdintInsert(second, first);
        }
        return false;
    }

    boolean oneEditReplace(String s1, String s2){
        boolean foundDifference = false;
        for (int i = 0; i < s1.length(); i++){
           // if char in s1 is not same as char in s2
            // if found return false
            if (s1.charAt(i) != s2.charAt(i)){
                if (foundDifference){
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }
    /* Check if you can insert a character into sl to make s2. */
    boolean oneEdintInsert(String s1, String s2){
        // assign index1 to 0 and index2 = 0
        int index1 = 0;
        int index2 = 0;
        // the condition does this while inde1 is less then str1.lengt and index2 is less then str2.lenght
        while (index2 < s2.length() && index1 < s1.length()){
           // if str1 at char index1 is not same as str2 at char at index2
            if (s1.charAt(index1) != s2.charAt(index2)){
               // and if index1 is not index2 then return false
                if (index1 != index2){
                    return false;
                }
                // otherwise index2 continue++
                index2++;
            }
            else {
                index1++;
                index2++;
            }
        }
        return true;
    }

//    boolean oneEdintInsert(String s1, String s2){
//        // assign
//        int indexs1 = 0;
//        int indexs2 = 0;
//        // condition while char is less then string
//        while ( indexs1 < s1.length() && indexs2 < s2.length()){
//            if (s1.charAt(indexs1) != s2.charAt(indexs2)){
//                if (indexs1 != indexs2){
//                    return false;
//                }
//                indexs2++;
//            }
//            else {
//                indexs1++;
//                indexs2++;
//            }
//        }
//        return true;
//    }
//

    /*   We might notice that the code for one EditReplace is very similar to that for one Editinsert.
    We can merge them into one method.
    To do this, observe that both methods follow similar logic:
    compare each character and ensure that the strings are only different by one.

    The methods vary in how they handle that difference.
    1. The method oneEditReplace does nothing other than flag the difference,
    2. Whereas oneEditinsert increments ++ the pointer to the longer string.
    We can handle both of these in the same method. */

    boolean oneEditAway2(String first, String second){
        /* Length checks. */
        if (Math.abs(first.length() - second.length()) > 1 ){
            return false;
        }
        /* Get shorter and longer string.*/
        String s1 = first.length() < second.length() ? first : second; // if first string is < less then second string
        // then s1 is first
        String s2 = first.length() < second.length() ? second : first;

        // assign
        int index1 = 0;
        int index2 = 0;

        // difference found assign
        boolean foundDifference = false;

        // condition until char index1, index2  is less's then s2, s1 length
        while (index2 < s2.length() && index1 < s1.length()){

            if (s1.charAt(index1) != s2.charAt(index2)) {

                /* Ensure that this is the first difference found.*/
                if (foundDifference) return false;
                foundDifference = true;

                // On replace, move shorter pointer
                if (s1.length() == s2.length()) {
                    index1++;
                }
            }
                else {
                    // If matching, move shorter pointer
                    index1++;
                }
                // Always move pointer for longer string
                index2++;
            }
        return true;
        }



    }


// This algorithm (and almost any reasonable algorithm) takes O ( n) time, where n is the length of the shorter
//string.