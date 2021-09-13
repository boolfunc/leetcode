package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode242Test {

    @Test
    public void testAnagram(){

        String t = "anagram";
        String s = "nagaram";

        AnagramWord242 solution = new AnagramWord242();

        System.out.println(solution.isAnagram(s, t));

        System.out.println(solution.isAnagram("rat", "at"));


    }
}
