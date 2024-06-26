package com.bank.leetcode.sorting_searching;
/*   Sorted Search, No Size: You are given an array-like data structure Listy which lacks a size
method. It does, however, have an elementAt ( i) method that returns the element at index i in
0( 1) time. If i is beyond the bounds of the data structure, it returns -1. (For this reason, the data
structure only supports positive integers.) Given a Listy which contains sorted, positive integers,
find the index at which an element x occurs. If x occurs multiple times, you may return any index*/
public class SortedSearch_No_Size {

    static class Listy {
        int[] arr;

        public Listy(int[] arr) {
            this.arr = arr;
        }

        public int elementAt(int i) {
            if (i < 0 || i >= arr.length) {
                return -1;
            }
            return arr[i];
        }
    }
        int search(Listy list, int value) {
            int index = 1;
            while (list.elementAt(index) != -1 && list.elementAt(index) < value) {
                index *= 2;
            }
            return binarySearch(list, value, index / 2, index);
        }

        int binarySearch(Listy list, int value, int low, int high) {
            int mid;
            while (low <= high) {
                mid = (low + high) / 2;
                int middle = list.elementAt(mid);
                if (middle > value || middle == -1) {
                    high = mid - 1; // L3  M8  H1O   V7 remove R side now M is H and minus -1 to the left side
                }
                else if (middle < value) { // L < M H now L  is M
                    low = mid + 1;
                }
                else {
                    return mid;
                }
            }
            return -1;
        }
    }



