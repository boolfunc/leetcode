package com.petcomp.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LeetCode9Test {
    
    @Test
    public void testPalindrome(){

        Palindrome solution = new Palindrome();

        assertTrue(solution.isPalindrome(121));
        assertFalse(solution.isPalindrome(-121));
        assertFalse(solution.isPalindrome(10));
        assertFalse(solution.isPalindrome(-101));
    }
}
