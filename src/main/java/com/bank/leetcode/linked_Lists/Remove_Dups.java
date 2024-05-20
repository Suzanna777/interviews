package com.bank.leetcode.linked_Lists;

import com.bank.code_library.LinkedlistNode;
import java.util.HashSet;


/*  Remove Dups:
 Write code to remove duplicates from an unsorted linked list.
 FOLLOW UP
 How would you solve this problem if a temporary buffer is not allowed?

 SOLUTION

 In order to remove duplicates from a linked list,
 1. we need to be able to track duplicates.
 2. A simple hash table will work well here.
 In the below solution,
 1. we simply iterate through the linked list,
 2. adding each element to a hash table.
 3. When we discover a duplicate element,
 4. we remove the element and continue iterating.
 5. We can do this all in one pass since we are using a linked list*/


public class Remove_Dups {
    void deleteDups(LinkedlistNode n){
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedlistNode previous = null;
        while (n != null){
            if (set.contains(n.data)){
                previous.next = n.next;
            }
            else {
                set.add(n.data);
                previous = n;
            }
            n = n.next;
        }
    }

    /*  Follow Up: No Buffer Allowed
   we don't have a buffer,
   we can iterate with two pointers:
   1. current which iterates through the linked list,
   2. and runner which checks all subsequent nodes for duplicates*/

    void deleteDups2(LinkedlistNode head){
        LinkedlistNode current = head;
        while (current != null){
            LinkedlistNode runner = current;
            while (runner.next != null){
                if (runner.next != null){
                    if (runner.next.data == current.data){
                        runner.next= runner.next.next;
                    }
                    else {
                        runner = runner.next;
                    }
                }
                current = current.next;
            }
        }
    }


}
