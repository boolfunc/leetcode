package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode234Test {

    @Test
    public void testPalindrome(){
        Palindrome234 palindrome = new Palindrome234();

        ListNode node = new ListNode();
        node.val = 1;
        node.next = new ListNode(2);

        System.out.println(palindrome.isPalindrome(node));

        node.next.next = new ListNode(1);
        System.out.println(palindrome.isPalindrome(node));

    }

}
