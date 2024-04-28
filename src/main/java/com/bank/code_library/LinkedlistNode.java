package com.bank.code_library;
/*   LinkedlistNode (Linked List)
  Like the TreeNode class, we often needed access to the internals of a linked list
  in a way that the built-in linked list class wouldn't support.
  For this reason, we implemented our own class and used it for many
  problems.*/
public class LinkedlistNode {
   public LinkedlistNode next,prev,last;
   public int data;
   public LinkedlistNode(int d, LinkedlistNode n, LinkedlistNode p){
      data = d;
      setNext(n);
      setPrevious(p);
   }
   public LinkedlistNode(int d){
      data = d;
   }

   public void setNext(LinkedlistNode n){
      next = n;
      if (this == last){
         last = n;
      }
      if (n != null && n.prev != this){
         n.setPrevious(this);
      }
   }
   public void setPrevious(LinkedlistNode p){
      prev = p;
      if (p != null && p.next != this){
         p.setNext(this);
      }
   }
   public LinkedlistNode clone(){
      LinkedlistNode next2 = null;
      if (next != null){
         next2 = next.clone();
      }
      LinkedlistNode head2 = new LinkedlistNode(data, next2, null);
      return head2;
   }

}
/*  Again, we've kept the methods and variables public
 because we often needed this access.
 This would allow the user to "destroy" the linked list,
 but we actually needed this sort of functionality
 for our purposes*/
