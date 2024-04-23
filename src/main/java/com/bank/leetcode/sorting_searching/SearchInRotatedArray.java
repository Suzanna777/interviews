package com.bank.leetcode.sorting_searching;
/*  Search in Rotated Array: Given a sorted array of n integers that has been rotated an unknown
 number of times, write code to find an element in the array. You may assume that the array was
 originally sorted in increasing order.
  EXAMPLE
 Input: find 5 in {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14}
 Output: 8 (the index of 5 in the array)

   SOLUTION
 If this problem smells like binary search to you, you're right!

  In classic binary search,
  we compare x with the midpoint to figure out
  if x belongs on the left or the right side.

  The complication here is that the array is rotated
  and may have an inflection point.
  Consider, for example,
  the following two arrays:
  Array: {10, 15, 20, 0, 5} L < M and if M < R
  Array2: {50, 5, 20, 30, 40}
 Note that both arrays have a midpoint of 20,
 but 5 appears on the left side of one
 and on the right side of the other.
 Therefore, comparing x with the midpoint is insufficient.

 However, if we look a bit deeper,
 we can see that one half of the array
 must be ordered normally (in increasing order).
 We can therefore look at the normally ordered
 half to determine whether we should
 search the left or right half.

 For example, if we are searching for 5 in Array 1,
 we can look at the left element (1 O) and middle element (20).
 Since 10 < 20, the left half must be ordered normally.
 And, since 5 is not between those,
 we know that we must search the right half.

  {50, 5, 20, 30, 40}
  In Array 2, we can see that since 50 > 20, L > M then R is normal
  the right half must be ordered normally.
  We turn to the middle (20) and right (40) element
  to check if 5 would fall between them.
  The value 5 would not;
  therefore, we search the left half.

   The tricky condition is
   if the left and the middle are identical,
   as in the example array { 2, 2, 2, 3, 4,2}.
   In this case, we can check if the rightmost element is different.
   If it is, we can search just the right side.
  Otherwise, we have no choice but to search both halves*/
public class SearchInRotatedArray {

    int search(int a[], int left, int right, int x){
        int mid = (left + right) / 2;
        //Found an element in mid? Check if x located in arr mid point
        if (x == a[mid]){
            return mid;
        }
        // Check if R smaller < L site?
        // if yes, then M would go to the left side
        // and remove by -1 utile to point L side
        if (right < left){
           return -1;
        }
        /* Either the left or right half must be normally ordered.
        Find out which side is normally ordered,
        and then use the normally ordered half to figure out
     *  which side to search to find x. */

        // Now we are looking in to the string of arr L M
        // if arr of left side is less than arr mid?
        // if Left is normally ordered.
        if (a[left] < a[mid]){
            // if x is greater or = left And x is less then M?
            if (x >= a[left] && x < a[mid]){
                // then Search left
                return search(a, left, mid - 1, x);
            }
            else {
                // Search right
                return search(a, mid + 1, right, x);
            }
        }
        //Right is normally ordered.
        else if(a[mid] < a[left]){
            // Search right
            if (x > a[mid] && x <= a[right]){
                return search(a, mid +1,right, x);
                }
            else {
                // Search left
                return search(a, left, mid -1, x );
            }
        }
        //Left or right half is all repeats
        else if (a[left] == a[mid]) {
            //If right is different, from the mid search it
            if (a[mid] != a[right]){
                // then mid +1 move to the right side
              return search(a, mid +1, right, x);
            }
            //Else, we have to search both halves
            else {
                // Search left
                int result = search(a, left, mid -1, x);
                // Search right
                if(result == -1){
                    return search(a, mid +1, right, x);
                }
                else {
                    return result;
                }
            }
        }
        return -1;
    }


}
