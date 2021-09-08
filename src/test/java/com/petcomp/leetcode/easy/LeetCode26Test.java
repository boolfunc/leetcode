package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode26Test {

    @Test
    public void testRemoveDumplicates(){

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        RemoveDumplicates removeDumplicates = new RemoveDumplicates();
        int num = removeDumplicates.removeDumplicates(nums);


        System.out.println(num);
    }
}
