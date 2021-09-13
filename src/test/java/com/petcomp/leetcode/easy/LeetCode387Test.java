package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode387Test {

    @Test
    public void testFirstUniqChar(){

        FirstUniqChar387 solution = new FirstUniqChar387();

        System.out.println(solution.findFirstUniqChar("leetcode"));
        System.out.println(solution.findFirstUniqChar("loveleetcode"));

    }
}
