package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode704Test {

    @Test
    public void testBinarySearch(){
        int[] nums = {-1,0,3,5,9,12};

        BinarySearch704 solution = new BinarySearch704();
        System.out.println(solution.search(nums, 9));
        System.out.println(solution.search(nums, 4));

    }
}
