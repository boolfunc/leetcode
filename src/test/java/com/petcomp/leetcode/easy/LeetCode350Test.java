package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LeetCode350Test {

    @Test
    public void testCommonSubset(){

        CommonSubSet350 solution = new CommonSubSet350();

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] result = solution.intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));

        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};
        int[] result2 = solution.intersect(nums3, nums4);
        System.out.println(Arrays.toString(result2));
    }
}
