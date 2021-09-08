package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LeetCode27Test {

    @Test
    public void testRemoveElement(){
        RemoveElement removeElement = new RemoveElement();

        int[] nums = {3,2,2,3};
        System.out.println(removeElement.removeElement(nums, 3));
        System.out.println(Arrays.toString(nums));
    }
}
