package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LeetCode66Test {

    @Test
    public void testPlusOne(){

        PlusOne66 solution = new PlusOne66();

        int[] result = solution.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});

        System.out.println(Arrays.toString(result));
    }
}
