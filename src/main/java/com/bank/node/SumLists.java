package com.bank.node;


// List of node class
class ListNode{
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
public class SumLists {

    public static ListNode addLists(ListNode L1, ListNode L2){
        // 1. Dummy node to start the result list
        ListNode dummyHead = new ListNode(0);

        // 2.Pointer to build the answer-linked list
        ListNode current = dummyHead;

        // 3. Carry from adding digits
        // If the sum is 10 or more, we need to carry over
        // you carry over to the next place reminder number.
        int carry = 0;

        // 4. Traverse both lists until they reach the end
        while (L1 != null || L2  != null) {

            // 5. you are assigning sum with carry reminder number
            int sum = carry;

            // 6. Add number from a previous step to current number do it for both lists L1 L2
            if (L1 != null) {
                sum += L1.val;
                L1 = L1.next;
            }
            if (L2 != null) {
                sum += L2.val;
                L2 = L2.next;
            }
            // 7. Update carry and create a new node for the result list
            carry = sum / 10; //If the sum is 10 or more, we need to carry over
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
            // 8. If there's still a carry
            // after reaching the end of both lists, add it to the result
            if (carry > 0){
                current.next = new ListNode(carry);
            }
            return dummyHead.next;
    }

    // 2. methods to print the linked list from the head to the next
    public static void printList(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.println(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode L1 = new ListNode(7);
        L1.next = new ListNode(1);
        L1.next.next = new ListNode(6);

        ListNode L2 = new ListNode(5);
        L2.next = new ListNode(9);
        L2.next.next = new ListNode(2);

        ListNode sum = addLists(L1, L2);
        printList(sum);
    }







}
