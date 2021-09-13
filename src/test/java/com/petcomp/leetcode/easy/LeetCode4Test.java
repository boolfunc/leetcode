package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode4Test {

    @Test
    public void testMedianSortedArrays(){

        int[] nums1 = {1,3};
        int[] nums2 = {2};

        MedianSortedArrays4 solution = new MedianSortedArrays4();
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));

        System.out.println(solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));

        System.out.println(solution.findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0}));

        System.out.println(solution.findMedianSortedArrays(new int[]{}, new int[]{1}));

        System.out.println(solution.findMedianSortedArrays(new int[]{2}, new int[]{}));

    }
}
