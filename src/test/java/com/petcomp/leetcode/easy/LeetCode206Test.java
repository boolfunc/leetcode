package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode206Test {

    @Test
    public void testReverseList(){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);

        ReverseLinkedList206 reverse = new ReverseLinkedList206();
        ListNode newNode = reverse.reverse(node);

        while(newNode != null){
            System.out.println(newNode.val);
            newNode = newNode.next;
        }
    }
}
