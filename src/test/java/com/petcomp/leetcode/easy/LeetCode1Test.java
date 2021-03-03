package com.petcomp.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LeetCode1Test {
    
    @Test
    public void testLeetCode1(){

        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        SumOfTwo solution = new SumOfTwo();
        int result[] = solution.sumOfTwo(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);

        int []nums2 = new int[]{3,2,4};
        int target2 = 6;
        int result2[] = solution.sumOfTwo(nums2, target2);
        assertEquals(1, result2[0]);
        assertEquals(2, result2[1]);

        int []nums3 = new int[]{3,3};
        int target3 = 6;
        int []result3 = solution.sumOfTwo(nums3, target3);
        assertEquals(0, result3[0]);
        assertEquals(1, result3[1]);
    }
}
