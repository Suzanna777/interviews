package com.bank.leetcode.sorting_searching;
/*  Sorted Merge: You are given two sorted arrays, A and B, where A has a large enough buffer at the
end to hold B. Write a method to merge B into A in sorted order.

   SOLUTION
 Since we know that A has enough buffer at the end,
 we won't need to allocate additional space.
 Our logic should involve simply comparing elements of A and B
 and inserting them in order,
 until we've exhausted all elements in A and in B.
 The only issue with this is that
 if we insert an element into the front of A,
 then we'll have to shift the existing
 elements backwards to make room for it.
 *** It's better to insert elements into the back of the array,
 where there's empty space.
 The code below does just that.
 It works from the back of A and B,
 moving the largest elements to the back of A. */


public class SortedMerge {

    void merge(int[] a, int[] b, int lastA, int lastB) {
        /* Index of last element in array a*/
        int indexA = lastA - 1;
        /* Index of last element in array b */
        int indexB = lastB - 1;
        /* end of merged array*/
        int indexMerged = lastB + lastA - 1;
        // B would start after A thus B is more than A
        while (indexB >= 0) {
            /* end of a is > than end of b */
            if (indexA >= 0 && a[indexA] > b[indexB]) {
                a[indexMerged] = a[indexA]; // copy element
                indexA--;
            } else {
                a[indexMerged] = b[indexB]; // copy element
                indexB--;
            }
            indexMerged--; // move indices
        }
    }

    // A0------starting space------B > 0
}
