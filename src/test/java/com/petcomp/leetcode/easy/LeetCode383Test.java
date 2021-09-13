package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode383Test {

    @Test
    public void testLetterConstruct(){

        LetterConstruct383 solution = new LetterConstruct383();

        System.out.println(solution.canConstuct("a", "b"));


        System.out.println(solution.canConstuct("aa", "ab"));

        System.out.println(solution.canConstuct("aa", "aab"));
    }
}
