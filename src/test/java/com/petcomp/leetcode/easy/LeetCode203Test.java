package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode203Test {

    @Test
    public void testRemove(){
        ListNode node = new ListNode(2);
        node.next = new ListNode(2);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(4);

        RemoveElement203 solution = new RemoveElement203();
        ListNode newNode = solution.remove(node, 1);

        while(newNode != null){
            System.out.println(newNode.val);
            newNode = newNode.next;
        }

    }
}
