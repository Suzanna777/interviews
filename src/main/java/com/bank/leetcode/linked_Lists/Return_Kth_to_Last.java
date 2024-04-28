package com.bank.leetcode.linked_Lists;

import com.bank.code_library.LinkedlistNode;

/*  Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list
*
  SOLUTION
  We will approach this problem both recursively and non-recursively.
  Remember that recursive solutions are
  often cleaner but less optimal.
  For example, in this problem, the recursive implementation is about half the
  length of the iterative solution
  but also takes 0( n) space,
  where n is the number of elements in the linked list.

  Note that for this solution,
  we have defined k such that passing ink = 1
  would return the last element,
  k 2 would return to the second to last element,
  and so on.
  It is equally acceptable to define k such that k = 0
  would return the last element.

  Solution #1: If the size of the linked list is known,
  then the kth to last element is the ( length - k) th element.
  1. We can just iterate through the linked list  to find this element.
  Because this solution is so trivial,
  we can almost be sure that this is not what the interviewer intende

   Solution #2: Recursive
   This algorithm recurses through the linked list.
   When it hits the end, the method passes back a counter set to 0.
   Each parent call adds 1 to this counter.
   When the counter equals k,
   we know we have reached the kth
   to last element of the linked list.
  Implementing this is short and sweet-provided
  we have a way of "passing back" an integer value through
  the stack.
  Unfortunately, we can't pass back a node
  and a counter using normal return statements.
  So how do we handle this?
  Approach A: Don't Return the Element.
  One way to do this is to change the problem to simply printing the kth to last element.
  Then, we can pass back the value of the counter simply through return values.
 *
 * */
public class Return_Kth_to_Last {
    int printKthToLast(LinkedlistNode head, int k){
        if (head == null){
            return 0;
        }
        int index = printKthToLast(head.next, k) + 1;
        if (index == k){
            System.out.println(k + " th to last node is " + head.data);
        }
        return index;
    }
}
