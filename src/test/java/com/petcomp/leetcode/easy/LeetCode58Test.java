package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode58Test {

    @Test
    public void testLastWordLength(){
        LastWordLength58 solution = new LastWordLength58();

        System.out.println(solution.lengthOfLastWord("hello world"));

        System.out.println(solution.lengthOfLastWord("luffy is still joyboy"));
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  "));

    }
}
