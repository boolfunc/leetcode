package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode136Test {

    @Test
    public void testSingleNum(){

        SingleNum136 solution = new SingleNum136();

        int[] nums = {1,2,2};
        System.out.println(solution.singleNum(nums));
    }
}
