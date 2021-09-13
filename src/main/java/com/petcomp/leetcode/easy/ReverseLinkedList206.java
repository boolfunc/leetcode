package com.petcomp.leetcode.easy;

import java.util.List;

public class ReverseLinkedList206 {

    public ListNode reverse(ListNode head){

        if (head == null) {
            return null;
        }

        ListNode tail = new ListNode(head.val);
        while(head.next != null){

            ListNode tmp = new ListNode(head.next.val);
            tmp.next = tail;
            tail = tmp;

            head = head.next;
        }

        return tail;
    }
}
