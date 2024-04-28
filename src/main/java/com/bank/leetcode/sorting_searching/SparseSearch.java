package com.bank.leetcode.sorting_searching;

/* Sparse Search: Given a sorted array of strings that is interspersed with empty strings, write a
 method to find the location of a given string.
 EXAMPLE
 Input: ball, {"at","", "", "", "ball", "car", "","", "dad", ""}
Output: 4*/
public class SparseSearch {

    int search(String[] strings, String str, int first, int last) {
        // { "as", "", "dka", "", "jsi", "" } 6 f0 + l6 = 6/2 = 3
        // count the index of the string arr
        if (first > last) return -1;
        /* Move mid to the middle  and the mid is an index of the string arr*/
        int mid = (last + first) / 2;

        /* If mid is empty, find closest non-empty string. */
        if (strings[mid].isEmpty()) {
            int left = mid - 1;
            int right = mid + 1;

            // do this untile LM int less F and RM > L
            while (true) {
                if (left < first && right > last) {
                    return -1;
                } else if (right <= last && !strings[left].isEmpty()) {
                    mid = right;
                    break;
                } else if (left >= first && !strings[left].isEmpty()) {
                    mid = left;
                    break;
                }
                right++;
                left--;
            }
        }

        /* Check for string, and recurse if necessary*/
        if (str.equals(strings[mid])) { //Found it!
            return mid;
        } else if (strings[mid].compareTo(str) < 0) { //Search right
            return search(strings, str, mid + 1, last);
        } else { //Search left
            return search(strings, str, first, mid - 1);
        }
    }

    // search strings arr with str
    int search(String[] strings, String str) {
        if (strings == null || str == null || str == "") {
            return -1;
        }
        return search(strings, str, 0, strings.length - 1);
    }
}
