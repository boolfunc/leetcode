package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode141Test {

    @Test
    public void testHasCircle(){

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = b;

        LinkedListHasCircle141 solution = new LinkedListHasCircle141();
        System.out.println(solution.hasCircle(a));
    }
}
