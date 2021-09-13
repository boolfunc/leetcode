package com.petcomp.leetcode.easy;

public class RemoveElement203 {

    public ListNode remove(ListNode head, int val){


        ListNode newHead = new ListNode();
        newHead.next = head;
        ListNode current = newHead;
        while(current != null){

            if (current.next != null && current.next.val == val){
                current.next = current.next.next;
            } else {
                current = current.next;
            }

        }
        return newHead.next;
    }
}
